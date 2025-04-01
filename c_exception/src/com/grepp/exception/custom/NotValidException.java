package com.grepp.exception.custom;

// UnChecked Exception (RuntimeException class를 상속받으면 만들 수 있음)
public class NotValidException extends RuntimeException{

    public NotValidException(String message) {
        super(message);
    }
}
