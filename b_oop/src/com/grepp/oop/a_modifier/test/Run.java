package com.grepp.oop.a_modifier.test;

import com.grepp.oop.a_modifier.A_modifier;

public class Run {

    public static void main(String[] args) {
        A_modifier.publicMethod();
        //A_modifier.protectedMethod(); //다른 패키지라 호출 불가
        //A_modifier.callPrivateMethod(); //다른 클래스라 호출불가
        //A_modifier.private(); // 다른 클래스라 호출불가
    }

}
