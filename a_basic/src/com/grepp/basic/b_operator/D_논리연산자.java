package com.grepp.basic.b_operator;

public class D_논리연산자 {

    // NOTE BD01 : 논리연산자 ( &&(and), ||(or) )
    // 논리 연산자 : 논리형 타입의 연산 -> 연산결과 : 논리형 타입
    // &&(and)  : 두 개의 조건이 모두 참이면 true
    //            && 연산은 첫 조건의 결과가 거짓이면, 두번째 조건을 평가하지 않음
    // ||(or)   : 두 개의 조건 중 하나만 참이어도 true
    //            || 연산은 첫 조건의 결과가 참이면, 두번째 조건을 평가하지 않음
    public static void main(String[] args) {
        System.out.println("=== and ===");
        System.out.println(2 >= 2 && 2 > 3); //true && false  -> false
        System.out.println(2 > 1  && 3 > 2); //true && true   -> true
        System.out.println(3 < 2  && 2 > 3); //false && false -> false
        System.out.println(3 < 2  && 2 > 1); // false && true -> false

        System.out.println("=== or ===");

        System.out.println(2 >= 2 || 2 > 3); // true || false -> true
        System.out.println(2 > 1  || 3 > 2); // true || true  -> true
        System.out.println(3 < 2  || 2 > 3); // false || false -> false
        System.out.println(3 < 2  || 2 > 1); // false || true -> true


        // NOTE BD02 : 논리연산의 우선순위 (&&가 || 보다 연산 우선순위가 높다.)
        boolean a = true;
        boolean b = false;
        boolean c = false;
        boolean d = false;


        System.out.println("===논리연산자 우선순위===");
        // 아래 논리연산의 결과를 예상해보시오
        System.out.println(a || b && c || d);
        // b && c -> false && false -> false
        // 그 다음 왼쪽부터 시작
        // a || false -> true || false -> true
        // true || false -> true가 됨


    }

}
