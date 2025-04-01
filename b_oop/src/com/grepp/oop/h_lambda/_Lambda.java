package com.grepp.oop.h_lambda;

import com.grepp.oop.h_lambda.function.Consumer;
import com.grepp.oop.h_lambda.function.Function;
import com.grepp.oop.h_lambda.function.Predicate;
import com.grepp.oop.h_lambda.function.Supplier;
import java.util.Random;

public class _Lambda {

    //우리가 만든 컨슈머 인터페이스 구현체받기
    public void testConsumer(Consumer<String> c){
        String msg = "_Lambda.testConsumer";
        c.accept(msg); //구현체가 오버라이드한 내용의 억셉트 호출
    }

    public void testSupplier(Supplier<String> s){
        System.out.println("_Lambda.testSupplier" +s.get());
    }

    public void testPredicate(Predicate<Integer> p){
        //난수생성
        int num = new Random().nextInt(5);
        if(p.test(num)){
            System.out.println("짝수입니다.");
        }else{
            System.out.println("홀수입니다.");
        }
    }

    public void testFunction(Function<String, String> f){
        System.out.println(f.apply("_Lambda.", "testFunction"));
    }

}
