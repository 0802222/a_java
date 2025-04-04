package com.grepp.exception.coffee;

import com.grepp.exception.custom.TimeOutException;
import com.grepp.exception.custom.TimeOutRuntimeException;
import java.util.Random;

public class Coffee {
    
    public void provide(){
        // 예외처리를 맨위까지 올려버림
        try {
            deductStock();
            addSalesCnt();
            System.out.println("커피음료 제공이 완료되었습니다.");
        } catch (TimeOutRuntimeException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("은행서버와 통신을 종료합니다.");
        }
    }

    private void addSalesCnt() {
        System.out.println("판매량 추가");

    }

    private void deductStock() {
        System.out.println("재고차감");
        purchase();
    }

    // 은행서버와 통신을 통해 잔고를 확인하고, 매입주문을 넣는 메서드
    private void purchase() {
        int delay = new Random().nextInt(5);

        if (delay > 0) {
            throw new TimeOutRuntimeException("은행 서버와 연결되지 못했습니다.");
        }

        System.out.println("재고 매입에 성공했습니다.");
    }
}
