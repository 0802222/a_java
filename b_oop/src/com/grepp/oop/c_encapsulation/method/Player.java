package com.grepp.oop.c_encapsulation.method;

import java.net.SocketTimeoutException;



// 객체의 자율성 : 객체가 맡은 일은 객체가 알아서 수행하도록 코드를 작성
public class Player {

    // 연주자
    // 연주를 하는 역할을 가지고 있는 객체
    private String instrument;

    public Player(String instrument) {
        this.instrument = instrument;
    }

    // 필요한 기능만 오픈
    public void play(){
        prepare();
        readNote();
        playing();
        curtainCall();
        end();
    }

    // 구체적인 기능은 은닉
    private void prepare(){
        System.out.println(instrument + "연주 준비합니다.");
    }

    private void readNote(){
        System.out.println(instrument + "악보를 봅니다.");
    }


    private void playing(){
        System.out.println(instrument + "연주를 합니다.");
    }

    private void curtainCall(){
        System.out.println(instrument + "커튼콜을 합니다.");
    }


    private void end(){
        System.out.println("연주를 마칩니다.");
    }
}
