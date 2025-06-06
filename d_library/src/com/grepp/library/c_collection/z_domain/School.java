package com.grepp.library.c_collection.z_domain;

import java.util.Objects;

public class School implements Comparable<School>{

    private String name;
    private String address;
    private Integer level;

    public School(String name, String address, Integer level) {
        this.name = name;
        this.address = address;
        this.level = level;
    }

    @Override
    public String toString() {
        return "school{" +
            "name='" + name + '\'' +
            ", address='" + address + '\'' +
            ", level=" + level +
            '}';
    }

    // NOTE CZ 제어반전
    // 개발자가 작성한 compareTo 메서드를 Collections 가 호출
    // 정렬을 위한 흐름을 Collections 가 제어, 개발자가 작성한 코드는 Collections 에 의해 사용

    // 스프링 프레임워크 : 웹 개발을 위한 A-Z는 미리 구현
    // O, P, Q, R 정도만 개발자에게 구현을 맡김

    // Comparable 인터페이스의 역할
    // compareTo 메서드의 override 를 강제
    // 우리가 정한 정렬기준은 Comparable 인터페이스의 compareTo메서드를 통해 전달됨
    @Override  // 확인 : 풀어보기
    public int compareTo(School o) {
        // 0. 학교 레벨을 기준으로 내림차순 정렬
        // 1. 정렬기준 변경 (학교명, 오름차순(a,b,c 순 ) 변경)
        // 2. 학교레벨로 정렬하되,만약 레벨이 같다면 학교명으로 내림차순 정렬
        return this.level -o.level;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof School school)) {
            return false;
        }
        return Objects.equals(name, school.name) && Objects.equals(address,
            school.address) && Objects.equals(level, school.level);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, level);
    }

    public String getName() {
        return this.name;
    }
}
