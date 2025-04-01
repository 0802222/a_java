package com.grepp.coffeemanager.domain.order;

// fixme : enum으로 리팩토링

// 주문 상태를 표현할 수 있는 클래스 (주문이 왜취소되었는지, 어디까지진행 됐는지)
public class OrderStatus {

    // static final 상수 : 주문상태 파악
    public static final OrderStatus OK = new OrderStatus(0, "주문 성공");
    public static final OrderStatus FAIL_SOLD_OUT = new OrderStatus(1, "재고 부족으로 주문을 취소 합니다.");
    public static final OrderStatus FAIL_SEASON = new OrderStatus(2, "비시즌 입니다.");


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
