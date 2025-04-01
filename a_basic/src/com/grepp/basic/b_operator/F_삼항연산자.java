package com.grepp.basic.b_operator;

public class F_삼항연산자 {

    public static void main(String[] args) {

        // NOTE BF01 : 삼항연산자(조건? 참일때 연산, : 거짓일 때 연산)
        int x = 100;
        int y = 3;

        int res =   x == y ?   x + y   :   x - y;
        //res = x와 y가 같다면 x+y 수행, 거짓이라면 x-y 수행
        System.out.println(res);
    }

}
