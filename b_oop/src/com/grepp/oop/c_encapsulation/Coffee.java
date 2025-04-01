package com.grepp.oop.c_encapsulation;


// NOTE CCoffee 01 : 캡슐화
// 모든 속성을 private 으로 선언해 클래스 외부와 내부를 구분
// 1. getter/ setter 로 구분 (캡슐화)
// getter : 속성에 들어갈 값을 클래스 외부로 전달
// setter : 속성에 들어갈 값에 대한 검증(validate)

// 2. 클래스 속성에 대한 권한관리
// getter/setter : 속성에 대한 읽고 쓰기 권한
// getter : 속성에 대한 읽기 권한 부여
// 아무것도 안만들면 속성을 숨김

public class Coffee {
    private String name;
    private int price;
    private int cost;
    private int stock;
    private int safetyStock;
    private int salesCnt;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        if(cost < 0) return; //이렇게 값이 0이면 리턴처리할 수 있음
        this.cost = cost;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getSafetyStock() {
        return safetyStock;
    }

    public void setSafetyStock(int safetyStock) {
        this.safetyStock = safetyStock;
    }

    public int getSalesCnt() {
        return salesCnt;
    }

    public void setSalesCnt(int salesCnt) {
        this.salesCnt = salesCnt;
    }
}
