package com.grepp.coffeemanager.domain.sale;

import static com.grepp.coffeemanager.domain.multilingual.payment.Language.createPaymentTranslator;

import com.grepp.coffeemanager.domain.multilingual.payment.ChinaPaymentTranslator;
import com.grepp.coffeemanager.domain.multilingual.payment.Language;
import com.grepp.coffeemanager.domain.multilingual.payment.Multilingual;
import com.grepp.coffeemanager.domain.multilingual.payment.PaymentTranslator;
import com.grepp.coffeemanager.domain.multilingual.payment.SpainPaymentTranslator;
import com.grepp.coffeemanager.domain.multilingual.payment.UsaPaymentTranslator;
import com.grepp.coffeemanager.domain.order.Order;
import com.grepp.coffeemanager.domain.payment.Payment;

public class Sale {

    public PaymentTranslator takeOrder(Order order) {
        order.proceed();
        Payment payment = new Payment(order);
        payment.proceed();
        // naming tip : generate : 원본응용시 사용, create : 새로 생성 시 사용
        return generatePaymentTranslator(payment);
    }

    // 필요한 시점에 다국어모드 추가가능
    private static PaymentTranslator generatePaymentTranslator(Payment payment) {
        PaymentTranslator target = payment;
        for(Language lang : Multilingual.languages()){
            target=Language.createPaymentTranslator(lang, target);
        }
        return target;
    }
}
