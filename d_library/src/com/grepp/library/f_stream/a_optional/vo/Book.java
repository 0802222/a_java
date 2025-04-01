package com.grepp.library.f_stream.a_optional.vo;

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
    //초기화가 강제됨
    public Book(){
        this("", "", null, null);
    }

    // 다른 생성자한테 위임해야됨
    public Book(Integer price){
        this("","", null, null);
    }
//    public modifyTitle(String title){
    // Cannot assign a value to final variable 'title'
//        this.title = title;
//    }
}
