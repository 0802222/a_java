package com.grepp.basic.c_prepare;

public class C_문자열 {

    // NOTE CC01 : String
    // 참조형 타입 : primitive type을 제외한 모든 타입
    // new 연산자 : heap 영역에 데이터를 저장할 공간을 할당받고, 주소를 변수에 연결해주는 연산자
    // 타입 변수명 = new 생성자 호출
    public static void main(String[] args) {

        //이런 방식은 잘쓰지않고, 바로 String a = "hi"; 와 같이 쓴다.
        String hello = new String("hello world");
        String hi = new String("hello world");

        //identityHashCode : 같은 주소면 같은값을 반환해줌
        System.out.println(System.identityHashCode(hello));
        System.out.println(System.identityHashCode(hi));

        //stack 영역의 주소값을 비교
        System.out.println(hello == hi);

        System.out.println("===literal 초기화===");

        //같은 문자열인지 비교
        //모든 참조형 변수는 등위비교를 할 때, equals()메서드로 비교해야 한다.
        System.out.println(hello.equals(hi));

        String a = "hi";
        String b = "hi";
        System.out.println(System.identityHashCode(hi));
        System.out.println(System.identityHashCode(hi));
        //System.out.println(a == b); 등위비교 시 이건 안쓰는게 좋음,
        System.out.println(a.equals(b));

    }

}
