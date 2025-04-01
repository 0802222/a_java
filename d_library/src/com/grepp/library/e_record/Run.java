package com.grepp.library.e_record;

public class Run {

    public static void main(String[] args) {
        //레코드 생성
        Book book = new Book("해리포터", "조앤롤링", 5000, true);
        //getter 확인
        System.out.println(book.title());
        System.out.println(book.author());
        System.out.println(book.price());
        System.out.println(book.activated());

        System.out.println(book);


        // equals 확인
        Book book2 = new Book("해리포터", "조앤롤링", -10, true);

        System.out.println(book);
        System.out.println("동일 여부 확인 :" + book.equals(book2));
    }

}
