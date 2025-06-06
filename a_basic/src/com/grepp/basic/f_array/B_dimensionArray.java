package com.grepp.basic.f_array;

import java.util.Arrays;

// 다차원 배열
public class B_dimensionArray {

    public static void main(String[] args) {
        //arrayQuiz();
       // pracDarray();
        dynamicArray();

    }

    private static void dynamicArray() {
        // NOTE FB02 : 가변 배열 (필요에 따라 동적할당 가능)
        // 주소 배열의 크기만 지정하고 값을 저장하는 배열의 크기는 미정으로 내버려 두는 것

        int[][] dArr = new int[2][];
        dArr[0] = new int[3];
        dArr[1] = new int[5];

        for(int[] nums : dArr) {
            for (int i = 0; i < nums.length; i++) {
                nums[i] = i;
            }

            System.out.println(Arrays.toString(nums));
        }

    }

    private static void arrayQuiz() {
        // 1부터 10까지의 정수를 보관하는 int 배열 3개를 생성하시오.
        int [][] arr = new int [3][10];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = j+1;
            }
            System.out.println();
        }

        for(int[] nums : arr) {
            System.out.println(Arrays.toString((nums)));
        }
    }

    // NOTE FB01 : 이차원 배열
    // 이차원 배열 = 배열을 요소로 가지는 배열
    // 이차원 배열의 인덱스로 접근하면 1차원 배열이 존재
    // int[][] arr
    // arr[0] : int[]

    private static void pracDarray() {
        int[] arr = {1, 2, 3, 4, 5};

        // 크기가 4인 Int[]을 3개 가지는 2차원 배열
        int[][] dArr = new int [3][4];
        dArr[0][0] = 1;
        dArr[0][1] = 2;
        dArr[0][2] = 3;
        dArr[0][3] = 4;

//        System.out.println(dArr); //타입@인스턴스의 메모리주소(16진수)
//        System.out.println(dArr[0]);
//        System.out.println(dArr[0][1]);

        for (int i = 0; i < dArr.length; i++) {
            int[] nums = dArr[i];
            //아래 코드 입력시 안에 들어있는 요소 확인 가능
            //System.out.println(Arrays.toString(nums));

            for (int j = 0; j < nums.length; j++) {
                System.out.println(nums[i] + " ");

            }
            System.out.println();
        }
    }
}
