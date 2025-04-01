package com.grepp.basic.f_array;

import java.util.Arrays;

public class A_array {

    public static void main(String[] args) {
        //pracArray();
        swalloCopy();
    }

    private static void swalloCopy() {
        // NOTE FA 02 : 얕은 복사 (하나의 객체를 두 레퍼런스가 참조하도록 객체의 주소를 복사하는 것)
        // 원본도 변경되는 이슈가 있을 수 있음
        // 얕은복사로 원본데이터를 변경하는 메서드들은 반환타입이 void 이거나 성공/실패 정도만 전달하는 경우 사용
        // side effect : 함수 내부의 로직이 함수 외부에 영향을 끼치는 상황(코틀린으로 넘어가면 사이드 이펙트에 예민해짐)


        //백종원 식당 메뉴
        String[] baek = {"김밥", "오뎅", "닭꼬치"};
        System.out.println(Arrays.toString(baek));

        //메뉴 변경 (닭꼬치를 떡볶이로 바꾸기)
        String[] our = changeMenu(baek);
        System.out.println("our: " + Arrays.toString(our));
        System.out.println("baek: " + Arrays.toString(baek));
    }

    private static String[] changeMenu(String[] baek) {
        // baek[2] = "떡볶이";

        // 깊은 복사 (원본을 복제하여 인덱스를 옮기는 것)
        // 깊은복사로 새로운 데이터를 생성하는 경우는 새롭게 생성한 데이터의 타입을 반환타입으로 지정
        String[] result = new String[baek.length];
        for (int i = 0; i < baek.length; i++) {
            result[i] = baek[i];
        }

        result[2] = "떡볶이";
        return result;
    }

    private static void pracArray() {
        // NOTE FA01 : Array
        // 배열 : 같은 타입의 데이터를 하나의 묶음으로 다루는 자료구조
        // 배열에 저장된 데이터는 index를 사용해 접근할 수 있다.
        // 배열 선언
        // 타입[] 변수명 = new 타입[크기]

        String[] foods = new String[5];
        foods[0] = "치킨"; //참조변수(레퍼런스 라고도 부름)
        foods[1] = "족발"; //참조변수(레퍼런스 라고도 부름)
        foods[2] = "회"; //참조변수(레퍼런스 라고도 부름)
        foods[3] = "피자";
        foods[4] = "마라탕";
        System.out.println(foods[0]);

        // 배열의 선언과 동시에 초기화
        int[] nums = new int[]{100,200,300,400,500};
        // length : 배열의 크기
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
        System.out.println();

        int[] nums2 = {999, 888, 777, 666, 555};

        // NOTE FA02 : 향상된 for문(for-each)
        // int e : 반환 받은 요소
        // nums2 : 반복가능한 객체
        for (int e : nums2){
            System.out.print(e + " ");
        }

    }

}
