package com.grepp.coffeemanager.domain.discount;

import com.grepp.coffeemanager.domain.order.Order;


public class PercentDiscountPolicy implements DiscountPolicy{

    @Override
    public int getDiscountAmount(Order order){
        // values() 사용 시 모든 enum을 배열로 반환해줌 (인스턴스를 배열로 다루는 함수)
        PercentDiscountLevel[] conditions = PercentDiscountLevel.values();
        for(PercentDiscountLevel condition : conditions) {
            if(condition.checkRange(order)){
                // 할인율 계산
                double discountAmount = order.getOrderPrice() * condition.rate();
                return (int) discountAmount;
            }
        }
        return 0;
    }

}
