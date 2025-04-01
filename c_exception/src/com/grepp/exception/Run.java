package com.grepp.exception;

import com.grepp.exception.custom.TimeOutException;
import java.net.MalformedURLException;

public class Run {

    // main 메서드에서 마저 throws를 하면 JVM이 예외처리를 해준다.
    // 단, 이 경우는 개발자가 예외처리를 하는것이 아니기 때문에 권장하지 않는다.
    public static void main(String[] args) {
        com.grepp.exception.A_Exception ex = new com.grepp.exception.A_Exception();
        //runtime.arithEx();
        //ex.malformedURLEx();
//        ex.throwsMalformedURLEx();
        ex.throwNotValidEx(100);

//
        try {
            ex.throwTimeOutEx();
            System.out.println("hi! 클라이언트");
        } catch (TimeOutException e) {
            System.out.println("catch 블록입니다.");
            System.out.println("죄송합니다. 연결에 실패했습니다. 라고 사용자에게 알린다.");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("try-catch 이후 코드");
    }

}
// 확인 : 런시켜보고 동작원리 이해하기