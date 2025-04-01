package com.grepp.library.a_wrapper;

public class Run {

    public static void main(String[] args) {
        // wrapper class 와 원시타입간 변환이 자동으로 제공
        // auto boxing : 원시타입을 wrapper 객체로 변환
        // auto unboxing : wrapper 객체를 원시타입 변환
        Boolean activated = true;
        Character ch ='a';
        Byte bNum = 2;
        Short sNum = 1000;
        Integer num = 10000;
        Long lNum = 100000L;
        Float fNum = 100.0f;
        Double dNum = 1000.0;

        //NOTE AA01 : wrapper 객체는 초기화 하지않을 경우, false, 0 등의 기본타입 대신 null 이 들어간다.

        A_wrapper wrapper = new A_wrapper();
        System.out.println(wrapper);
    }

}
