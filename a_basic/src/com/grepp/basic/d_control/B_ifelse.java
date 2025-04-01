package com.grepp.basic.d_control;

import java.util.Scanner;
import javax.naming.Name;

public class B_ifelse {

    // NOTE DB01 : 양자택일 조건문
    // if(조건식){조건식이 참일 때 코드 블럭};
    // else{조건식이 거짓일 때 코드 블럭};

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== 인증 ===\n");
        String username = "홍길동";
        String storedPassword = "1234";
        System.out.println("이름 : ");
        String name = sc.next();
        System.out.println("비밀번호 : ");
        String password = sc.next();

        //아이디와 비밀번호 모두 일치하면 인증성공, 인증실패


        if(username.equals(name) && password.equals(storedPassword)) {
            System.out.println("환영합니다. " + name + "님!");
        } else {
            System.out.println("인증에 실패했습니다.");
        }
    }
}
