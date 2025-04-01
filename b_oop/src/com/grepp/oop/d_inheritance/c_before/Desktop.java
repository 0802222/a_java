package com.grepp.oop.d_inheritance.c_before;

public class Desktop {

    private String brand;
    private String name;
    private int price;
    private String cpu;
    private boolean allInOne;

    public void on() {
        System.out.println(name + "켰습니다.");
    }

    @Override
    public String toString() {
        return "Desktop{" +
            "cpu='" + cpu + '\'' +
            ", brand='" + brand + '\'' +
            ", name='" + name + '\'' +
            ", price=" + price +
            ", allInOne=" + allInOne +
            '}';
    }

    public Desktop(String brand, String name, int price, String cpu, boolean allInOne) {
        this.brand = brand;
        this.name = name;
        this.price = price;
        this.cpu = cpu;
        this.allInOne = allInOne;
    }
}
