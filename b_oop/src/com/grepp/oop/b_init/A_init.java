package com.grepp.oop.b_init;

public class A_init {

    // NOTE BB01 : 초기화 순서
    // 인스턴스 변수 : JVM의 기본 값 > 직접 대입한 값 > 초기화 블록 > 생성자
    // 클래스 변수  : JVM의 기본 값 > 직접 대입한 값 > static 초기화 블록

    private String name = "홍길동";
    private static int classCode = 777;

    // NOTE BB02 : 초기화 블록
    {
        System.out.println("1. 직접 대입한 값 : " + name);
        System.out.println("초기화 블록 호출");
        name = "HGD";
        System.out.println("================================");
    }

    // NOTE BB03 : static 초기화 블록
    static{
        System.out.println("1. static 직접 대입한 값 : " + classCode);
        System.out.println("static 초기화 블록 호출");
        classCode = 888;
        System.out.println("================================");
    }

    public A_init(String name) {
        System.out.println("2. static 초기화 블록에서 넣은 값 : " + classCode);
        System.out.println("2. 초기화 블록에서 넣은 값 : " + this.name);
        System.out.println("생성자 호출");


        this.name = name; //생성자에서 this 를 쓰는 이유 : name이 겹치기 때문에 식별하기 위해 써줬음(일반적으론 생략가능)
        System.out.println("3. 생성자에서 넣은 값 : " + this.name);
    }

    public static void loadClass(){

    }
}
