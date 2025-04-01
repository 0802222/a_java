package com.grepp.library.a_wrapper;

// NOTE AA01 Wrapper class
// 순수 OOP 언어 : 모든 것이 객체로 이루어진 언어
//                ex) 파이썬
// 자바는 원시타입이 있기 때문에 순수 OOP 언어가 아니다
// wrapper class : 자바가 원시 타입을 객체로 대체할 수 있도록 제공해주는 클래스
public class A_wrapper {
    private boolean activated;
    private Boolean wActivated;
    private int num;
    private Integer wNum;
    private char ch;
    private Character wCh;
    private double dNum;
    private Double wDum;

    @Override
    public String toString() {
        return "A_wrapper{" +
            "activated=" + activated +
            ", wActivated=" + wActivated +
            ", num=" + num +
            ", wNum=" + wNum +
            ", ch=" + ch +
            ", wCh=" + wCh +
            ", dNum=" + dNum +
            ", wDum=" + wDum +
            '}';
    }
}
