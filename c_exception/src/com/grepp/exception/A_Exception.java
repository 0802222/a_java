package com.grepp.exception;

// NOTE A01 Error 와 예외
// Error : 예측이 불가능하고 대응이 안되는 문제
// Exception : 예측 가능하고 대응이 가능한 문제, 사전에 예방 가능(예외 처리)

// Compile Exception : 컴파일 시점에 발생하는 예외, IDE 가 알려주는 예외
// Runtime Exception : 실행되는 시점에 발생하는 예외, 코드에서 방어가능한 예외

import com.grepp.exception.custom.NotValidException;
import com.grepp.exception.custom.TimeOutException;
import java.net.MalformedURLException;
import java.net.URI;
import java.util.Random;
import java.util.Scanner;

// Checked Exception : 코드로 예외처리가 불가능한 경우 발생, 예외처리를 강제하는 Exception
// Unchecked Exception : 코드로 예외처리가 가능한 경우 발생, 예외처리를 강제하지 않는 Exception

// 에러 : java.lang.ArithmeticException
public class A_Exception {

    public void arithEx() {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("숫자 : ");
            int num = sc.nextInt();

            int random = new Random().nextInt(0, 4); // 0 ~ 3 사이 난수 생성

            // 오류 방지 if문 추가
            if(random == 0) {
                System.out.println("연산 결과 0으로 나눌 수 없습니다. 다시입력해주세요.");
                continue;
            }

            int result = num / random;
            System.out.println("나누어진 몫은 " + result + "입니다.");

            if(num == 444) break;
        }
    }

    // NOTE A02 : try-catch-finally
    // try 코드블록에 예외가 발생할 수 있는 코드를 작성, catch 블록에 예외처리 코드 작성
    // finally : 예외 발생 여부와 상관없이 반드시 실행되어야 하는 코드를 작성
    //코드로 예외처리가 불가능한 경우, 예외처리가 강제되는 상황
    public void malformedURLEx() {
        //URL을 표현하는 클래스 "URI"
        try {
            URI url = URI.create("https://www.naver.com");
            System.out.println("URL 객체 생성 성공!");
        } catch (Exception e) {
            System.out.println("잘못된 URL 입니다.");
            e.printStackTrace();
        } finally {
            System.out.println("연결을 종료합니다.");
        }

    }

    // NOTE A03 : throws (메서드 선언부에서 사용하는 예약어)
    // throws : 메서드 안에서 예외가 발생할 경우, 즉시 메서드를 종료하고 호출부로 예외 객체를 반환
    // 호출부에서는 반환될 예외를 처리하기 위한 예외처리가 강제됨
    public void throwsMalformedURLEx() throws MalformedURLException {
        URI url = URI.create("https://www.naver.com");
        System.out.println("URL 객체 생성 성공!");
    }

    // NOTE A04 throw (우리가 만든 코드안에서 예외객체를 발생 시키는 예약어)
    // throw : 예외를 발생시키는 예약어
    public void throwTimeOutEx() throws TimeOutException {
        while (true){
            int delay = new Random().nextInt(5);
            // 만약 지연시간이 3초 이상이면, 더이상 기다릴 수 없다고 판단
            // TimeOutException을 발생

            if(delay > 3){
                throw new TimeOutException("통신 연결시간이 4초이상 지났습니다."); // 우리가 만든 예외객체를 처리하도록 강제함
            }

            System.out.println("통신에 성공했습니다.");

        }
    }


    //UnChecked Exception 이라서 예외처리 강제가 존재하지않음
    public void throwNotValidEx(int price){
        if(price < 0) {
            throw new NotValidException("가격은 0원보다 작을 수 없습니다.");
        }

        System.out.println(price + "원 입니다.");
    }
}
