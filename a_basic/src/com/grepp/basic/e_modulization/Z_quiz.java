package com.grepp.basic.e_modulization;

import java.util.Scanner;

public class Z_quiz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("1P : ");
        String p1 = sc.nextLine();

        System.out.print("2P : ");
        String p2 = sc.nextLine();

        String result = winOrLose(p1, p2);
        System.out.println("결과 : " + result);

        sc.close();
        }



        private static String winOrLose (String p1, String p2){
            if (p1.equals("가위")) {
                if(p2.equals("바위")) {
                    return "패";
                } else if (p2.equals("보")) {
                    return "승";
                } else {
                    return "비김";
                }
            } else if (p1.equals("바위")){
                if(p2.equals("바위")) {
                    return "비김";
                } else if (p2.equals("보")) {
                    return "패";
                } else {
                    return "승";
                }
            } else if (p1.equals("보")){
                if (p2.equals("바위")) {
                    return "승";
                } else if (p2.equals("보")) {
                    return "비김";
                } else {
                    return "패";
                }
            } return "잘못된 입력입니다.";
        }
    }

    // q.
// 1P 유저로부터 "가위"/"바위"/"보" 중 하나를 입력받으세요
// 2P 유저로부터 "가위"/"바위"/"보" 중 하나를 입력받으세요.
// 1P 유저기준에서 승/패/비김 여부를 출력해주세요.



