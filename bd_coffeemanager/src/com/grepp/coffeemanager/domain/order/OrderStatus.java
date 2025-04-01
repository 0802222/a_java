package com.grepp.coffeemanager.domain.order;

// NOTE ENUM : 연관된 상수들의 집합

// 주문 상태를 표현할 수 있는 클래스 (주문이 왜취소되었는지, 어디까지진행 됐는지)
public enum OrderStatus {

    // static final 상수 : 주문상태 파악
     OK (0, "주문 성공"),
     FAIL_SOLD_OUT (1, "재고 부족으로 주문을 취소 합니다."),
     FAIL_SEASON (2, "비시즌 입니다.");


    private int code;
    private String desc;

    private OrderStatus(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public boolean isOk(){
        return code == 0;
    }
    public String desc(){
        return desc;
    }

}
