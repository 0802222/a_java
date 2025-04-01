package com.grepp.basic.d_control;

import java.util.Scanner;
import java.util.logging.XMLFormatter;

public class F_star {

    public static void main(String[] args) {
        //q1();
        //q2();
        //q3();
        q5();
    }

    private static void q5() {
//        다이아몬드 그리기
//        num = 입력값
//        top
//        x : 1부터 입력값 까지 1씩 증가하는 수열
//        별 : 2 * x -1
//        공백 : num - x
//
//        bottom
//        y : 1부터 입력값 -1까지 1씩 증가하는 수열
//        별 : 2 * num -1 - 2 * y
//             정리 -> 2 * num -2 * y -1
//             정리 -> 2 * (num - y) -1
//        공백 : y
        Scanner sc = new Scanner(System.in);
        System.out.println("입력 : ");
        int num = sc.nextInt();

        for (int x = 1; x <= num ; x++) {
            // 공백
            for (int i = 0; i < num - x; i++) {
                System.out.print(" ");
            }
            // 별
            for (int i = 0; i < 2 * x - 1; i++) {
                System.out.print("*");
            }
            System.out.println();


        }
        for (int y = 0; y < num; y++) {
            for (int i = 0; i < y; i++) {
                System.out.print(" ");
            }

            for (int i = 0; i < 2 * (num - y) - 1; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    private static void q3(){
        Scanner sc = new Scanner(System.in);
        System.out.print("num : ");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) { //num =7
            //왼쪽 별 출력
            for (int j = 0; j < i; j++) { //0번 부터 별찍음
                System.out.print(" ");
            }

            //숫자 출력
            System.out.print(i + 1);

            //오른쪽 별 출력
            for (int j = 0; j < (num - i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }

    private static void q2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("num : ");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void q1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("row : ");
        int row = sc.nextInt();

        System.out.print("col : ");
        int col = sc.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}