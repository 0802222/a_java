package com.grepp.basic.b_operator;

public class B_증감연산자 {

    public static void main(String[] args) {

        // NOTE BB01 : 증감연산자 (++, --)
        // ++ : 값을 1 증가 시킴
        // -- : 값을 1 감소 시킴
        // 전위 연산자(++변수) : 연산전에 증감처리
        // 후위 연산자(변수++) : 연산후에 증감처리

        int x = 10;
        System.out.println(++x); //11
        System.out.println(x++); //11 (x=12)
        System.out.println(--x); //11
        System.out.println(x + ++x); // 11 + 12 = 23
        System.out.println(x + x++); // 12 + 12 = 24 (x=13)
        System.out.println(x + x); // 13 + 13 = 26
        System.out.println(x + x--); //13 + 13 = 26 (x=12)
        System.out.println(x + --x); //12 + 11 = 23

        // C언어 -> C++ -> C#

    }

}
