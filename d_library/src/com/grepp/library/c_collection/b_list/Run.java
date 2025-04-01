package com.grepp.library.c_collection.b_list;


import com.grepp.library.c_collection.b_list.grepp._ArrayList;
import com.grepp.library.c_collection.b_list.grepp._LinkedList;
import com.grepp.library.c_collection.b_list.grepp._List;
import com.grepp.library.c_collection.z_domain.School;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Run {

    public static void main(String[] args) {

        // NOTE B01 : CRUD
        // 데이터를 조작하는 방법
        // Create, Read, Update, Delete

//        pracAdd();
//        pracGet();
//        pracSet();
//        pracRemove();
        pracSort();
//        compareTo();
//        pracIterable();

    }

     //확인: 고치기
    private static void pracIterable() {
        _List<Integer> list = new _LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

//
//        for (int i = 0; i < 10; i++) {
//            System.out.println(list.get(i));
//        }

        for(Integer i : list){
            System.out.println(i);
        }
    }



    // 확인 : compareTo 내가쓴거임,, school에서 확인해보고 다시만들기
//    private static int compareTo() {
//        School seoul = new School("서울대", "관악구", 4);
//        School yeonsae = new School("연세대", "신촌", 4);
//        School minsa = new School("민사고", "대전", 3);
//        School grepp = new School("그랩", "삼성", 10);
//        School semyoung = new School("세명초", "속초", 1);
//
//        List<School> schools = new ArrayList<>(List.of(seoul, yeonsae, minsa, grepp, semyoung));
//
//        Collections.sort(schools);
//        System.out.println(schools);
//
//    }

    private static void pracSort() {
        School seoul = new School("서울대", "관악구", 4);
        School yeonsae = new School("연세대", "신촌", 4);
        School minsa = new School("민사고", "대전", 3);
        School grepp = new School("그랩", "삼성", 10);
        School semyoung = new School("세명초", "속초", 1);

        // 불변 리스트임 (List.of로 만든걸 ArrayList<>에 넣어서 가변객체로만듦)
        List<School> schools = new ArrayList<>(List.of(seoul, yeonsae, minsa, grepp, semyoung));
        List<Integer> nums = new ArrayList<>(List.of(23,5,78,433,14,266,789));

        // return 타입이 void로서, 원본에 영향을줌
        Collections.sort(nums);
        System.out.println(nums);

        // Lambda 적용
        Collections.sort(schools, (School a, School b) -> a.getName().compareTo(b.getName()));
        System.out.println(schools);
    }



    private static void pracRemove() {
        _LinkedList<Integer> list = new _LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list);
        list.remove(2);

        for (int i = 0; i < 9; i++) {
            System.out.println(list.get(i));
        }

        // 0,1,2,3 인덱스 삭제 (연속된 인덱스 삭제)
        //sublist()를 사용해 원하는 만큼 리스트를 잘라 반환한다음에 removeAll()메서드에 넣어줌
//        List<Integer> sublist = list.subList(0, 4);
//        list.removeAll(sublist);
//        System.out.println(list);
    }

    private static void pracSet() {
        School seoul = new School("서울대", "관악구", 4);
        School yeonsae = new School("연세대", "신촌", 4);
        School minsa = new School("민사고", "대전", 3);
        School grepp = new School("그랩", "삼성", 10);
        School semyoung = new School("세명초", "속초", 1);

        _LinkedList<School> list = new _LinkedList<>();
        list.add(seoul);
        list.add(yeonsae);
        System.out.println(list.get(0));

        list.set(0, grepp);
        System.out.println(list.get(0));


    }

    private static void pracGet() {
       List<String> list = new ArrayList<>();
       list.add("안녕");
       list.add("hi");
       list.add("hello");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            //System.out.println(list.getFirst());
            //System.out.println(list.getLast());
        }
    }

    private static void pracAdd() {
        _ArrayList<Integer> list = new _ArrayList<>();

        for (int i = 0; i < 30; i++) {
            list.add(i);
        }


        for (int i = 0; i < 30; i++) {
            System.out.print(list.get(i)+ " ");
        }
        System.out.println("\n=============");
    }


}
