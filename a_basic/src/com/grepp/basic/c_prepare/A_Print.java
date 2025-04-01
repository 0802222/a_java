package com.grepp.basic.c_prepare;

public class A_Print {

    public static void main(String[] args) {

        // " : 문자열 표현
        // ' : 문자  표현

        // NOTE CA01 : escape sequence (특정 문자를 표현하기 위한 특별한 문자열)
        // \(역슬래시)를 prefix(접두사)로 붙여준다.
        // \\ : 문자 그대로의 \
        // \n : 줄바꿈
        // \r : carriage return : 커서를 현재 줄의 맨 앞으로 이동 (콘솔에서 2개의 출력값을 1개의 자리에서 변화과정으로 보여줌 ex. 상태가 '진행중' 이었다가 '완료' 로 바뀜)
        // *\r\n : 줄바꿈
        // \t : tab
        // \', \" : 문자그대로의 ', "

        // \"영수증\" 표현하기
        System.out.println("\\\"영수증\\\"");

        // NOTE CA02 : print 출력
        // println : 출력 후 줄바꿈

        System.out.print("print\n");
        System.out.println(" hello world");

        // NOTE CA03 : printf (출력 형식 지정)
        // %d : 정수형
        // %c : 문자
        // %s : 문자열
        // %f : 실수형
        // %b : 논리형

        System.out.printf("주문자명 : %s\n", "하명도");

        // 정렬 : %5d, %-5d, %.2f
        // %5d : 5칸 공간 확보, 우측정렬
        // %-5d : 5칸 공간 확보, 좌측 정렬
        // %.2f : 소수점 2자리까지 표현

        System.out.printf("상품코드 : %s | 가격 : %d | 할인 : %f | 품절여부 : %b\n", "p101", 15000, 0.2, true);
        System.out.printf("상품코드 : %8s | 가격 : %10d | 할인 : %.2f | 품절여부 : %b\n", "p101", 15000, 0.2, true);
        System.out.printf("상품코드 : %8s | 가격 : %10d | 할인 : %.2f | 품절여부 : %b\n", "p101", 8000, 0.2, true);

        System.out.printf("상품코드 : %-8s | 가격 : %-10d | 할인 : %.2f | 품절여부 : %b\n", "p101", 8000, 0.2, true);
        System.out.printf("상품코드 : %-8s | 가격 : %-10d | 할인 : %.2f | 품절여부 : %b\n", "p101", 8000, 0.2, true);
    }

}
