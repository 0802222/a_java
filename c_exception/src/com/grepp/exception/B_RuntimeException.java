package com.grepp.exception;

import java.util.Random;
import java.util.Scanner;

public class B_RuntimeException {

    public static void main(String[] args) {
//        arithEx();
        multiEx();


    }

    public static void arithEx() {
        Scanner sc = new Scanner(System.in);

        while(true) {
            try {
                System.out.println("숫자 : ");
                int num = sc.nextInt();
                int random = new Random().nextInt(0, 4); // 0 ~ 3 사이 난수 생성
                int result = num / random;
                System.out.println("나누어진 몫은 " + result + "입니다.");
                if(num == 444) break;
            }catch(ArithmeticException e){
                System.out.println("연산 결과 0으로 나눌 수 없습니다. 다시입력해주세요.");
            }

        }
    }

    static void multiEx(){
        try{
            // ClassCastException 형변환 과정에서 발생하는 예외
            Object obj = new Object();
//            String Str = (String) obj;

            // 에러 : ArrayIndexOutOfBoundsException
            int[] arr = new int[2];
            //arr[2] = 10;

            //찾아갈 인스턴스 참조값이 없고 null이 있어서 발생하는 문제
            String nullStr = null;
            // null 이 담겨있는 참조변수로 속성이나 메서드를 사용할 경우 발생하는 예외
            nullStr.equals("a");

//        }catch (ArithmeticException e) {
//            System.out.println("ClassCastException 의 catch block");
//            System.out.println(e.getMessage());
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("ArrayIndexOutOfBoundsException");
//            System.out.println(e.getMessage());
//        }catch (NullPointerException e){
//            System.out.println("NullPointerException");
//            System.out.println(e.getMessage());
//        }catch(Exception e){
//            System.out.println(e.getMessage()); // 확인 :getmessage 역할이뭐지? e는 매개변수라네..
        }catch(ClassCastException | ArrayIndexOutOfBoundsException | NullPointerException e){
            System.out.println(e.getMessage()); // 자바1.7 부터 지원됨, 동일한 예외처리 전략 시 사용
        }
    }
// 확인 : 다형성활용해서 예외처리하는 거 흐름 이해하기

}
