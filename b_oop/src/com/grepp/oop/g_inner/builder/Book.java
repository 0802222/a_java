package com.grepp.oop.g_inner.builder;

import java.lang.Thread.Builder;

public class Book {
    private String title;
    private String author;
    private Integer price;
    private Boolean activated;


    private Book(String title, String author, Integer price, Boolean activated) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.activated = activated;
    }

    @Override
    public String toString() {
        return "Book{" +
            "title='" + title + '\'' +
            ", author='" + author + '\'' +
            ", price=" + price +
            ", activated=" + activated +
            '}';
    }

    // NOTE G5 builder 패턴
    // static 필드에서는 인스턴스 접근안되니까~
    public static class Builder{
        private String title;
        private String author;
        private Integer price;
        private Boolean activated;

        //필드 초기화 메서드 생성(반환타입 빌더타입)
        // NOTE 06 메서드 체인 방식 (엄청 많이 쓰임)
        // this 를 반환해서 인스턴스 메서드를 연쇄적으로 호출
        public Builder title(String title){
            this.title = title;
            return this;
        }
        public Builder author(String author){
            this.author = author;
            return this;
        }
        public Builder price(Integer price){
            this.price = price;
            return this;
        }
        public Builder activated(Boolean activated){
            this.activated = activated;
            return this;
        }

        public Book build(){
            return new Book(title, author, price, activated);
        }


    }
// 외부 생성, 수정권한 막기
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getAuthor() {
//        return author;
//    }
//
//    public void setAuthor(String author) {
//        this.author = author;
//    }
//
//    public Integer getPrice() {
//        return price;
//    }
//
//    public void setPrice(Integer price) {
//        this.price = price;
//    }
//
//    public Boolean getActivated() {
//        return activated;
//    }
//
//    public void setActivated(Boolean activated) {
//        this.activated = activated;
//    }
}
