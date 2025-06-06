package com.grepp.oop.h_lambda;

import com.grepp.oop.h_lambda.domain.Exam;

public class Run {

    public static void main(String[] args) {

        // NOTE H01 Lambda (익명 함수, 단일의 경우 사용)규칙
        // 1. 매개변수의 타입은 생략할 수 있다. (이미 인터페이스에 정의해놨기때문에)
        // 2. 매개변수가 하나라면 매개변수의 선언부의 괄호는 생략한다.
        //    ex) () -> {}, (a, b) -> {}, a -> {}
        // 3. 코드블록의 코드가 한 줄인 경우{} 생략할 수 있다.
        //    ex) () -> System.out.println("hi");
        // 4. 반환문만 존재하는 함수라면 {}과 return 을 함께 생략할 수 있다.

        _Lambda lambda = new _Lambda();
        lambda.testConsumer(a -> {
            System.out.println(a);
            System.out.println("================");
        }); // 아까 만든 익명클래스랑 동일하게 동작함

        lambda.testSupplier(() -> ": 공급받은 문자열");
        System.out.println("================");

        lambda.testPredicate(num -> {
            System.out.println(num + "의 홀짝여부 판단");
            return num % 2 == 0;
        });
        System.out.println("================");

        lambda.testFunction((a, b) -> a + b);
        System.out.println("================");

        Exam kor = new Exam("국어", "하명도", 70);
        Exam math = new Exam("수학", "하명도", 70);

        System.out.println("국어시험 통과여부");
        System.out.println(kor.isPass(exam -> exam.getScore() >= 80));
        System.out.println("수학시험 통과여부");
        System.out.println(math.isPass(exam -> exam.getScore() >= 60));

        // 메서드 참조
        // 함수형 인터페이스의 추상메서드 선언부(반환타입, 매개변수 목록)와 일치하는
        // 다른 클래스의 메서드라면 메서드 참조 형식으로 사용할 수 있다.
        // Class Name :: 메서드명 => static 메서드, 임의 인스턴스 메서드
        // 참조변수 :: 메서드명 => 인스턴스 메서드 호출
        // Class Name :: new => 생성자 호출

        //메서드 선언부가 같음 -> 메서드 참조 이용 (워닝의 리플레이스 기능 클릭해서 리팩토링)
        lambda.testConsumer(System.out::println);

        //매개변수는 있고 리턴타입은 없음 -> 기본생성자 호출 시 사용
        lambda.testSupplier(String::new);


    }

}
