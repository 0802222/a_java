package com.grepp.exception.custom;

// NOTE B01 : 예외객체 만들기
// Checked Exception (Exception class를 상속받으면 만들 수 있음)
// UnChecked Exception (RuntimeException class를 상속받으면 만들 수 있음)
public class TimeOutException extends Exception{

    public TimeOutException(String message) {
        super(message);
    }
}
