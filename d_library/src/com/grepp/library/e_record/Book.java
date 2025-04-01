package com.grepp.library.e_record;

// NOTE E01 Record
// 도메인 객체 : 역할과 책임을 가지고 있는 객체
// 데이터 객체 : 데이터 전송이나 저장을 위한 객체
//      DTO : Data Transfer Object (mutable, setter 가 다 열려있다.)
//       VO : Value Object (immutable, 수정되면 안되는 객체)

// record == vo (불변객체를 간편히 만들어준다.)
// 불변 데이터 클래스 (필드는 private final)
// 속성명으로 getter 자동 생성 (getTitle(x), title(o))
// equals, hashcode, toString 자동 overriding 됨
// 자바에서 record 생성하면 변경하기 어려운데, 코틀린은 변경이 쉬워서 자주 씀(코틀린에서 롬복이 안됨)

public record Book(
    String title,
    String author,
    Integer price,
    Boolean activated
) {

    // NOTE E02
    // 자동으로 생성되는 매개변수 있는 생성자(canonical 생성자) 이외의 생성자를 사용할 때는
    // 다른 (canonical) 생성자에게 객체 생성을 위임해야한다.
    public Book(){
        this("", "", null, null);
    }

    //추가적인 입력값 처리하기
    // NOTE E 03 compact 생성자
    // 생성자로 전달된 인자에 대한 검증 로직 수행
    public Book{
        System.out.println("compact 생성자 : " + title);
        if(price == null || price < 0) throw new IllegalArgumentException();
    }

//    public modifyTitle(String title){
    // Cannot assign a value to final variable 'title'
//        this.title = title;
//    }
}
