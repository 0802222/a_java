package com.grepp.basic.b_operator;

public class C_비교연산자 {

    // NOTE BC01 : 비교연산( <, >, <=, >=, ==, !=)
    // Type : 논리형, 숫자형, 문자형
    // 산술, 증감연산자 : 숫자형 타입끼리 연산 -> 연산 결과 : 숫자형 타입
    // 비교연산자      :                    연산 결과 : 논리형 타입

    public static void main(String[] args) {

        int x = 20, y = 10;

        //대소 비교
        System.out.println(x > y);
        System.out.println(x >= y);
        System.out.println(x < y);
        System.out.println(x <= y);


        //동등 비교
        System.out.println(x == y);
        System.out.println(x != y);



    }

}
