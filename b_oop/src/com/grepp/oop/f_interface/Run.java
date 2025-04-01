package com.grepp.oop.f_interface;


public class Run {

    public static void main(String[] args) {
        Starlink smartPhone = new SmartPhone(
            "애플",
            "아이폰",
            1,
            "긱벤치",
            "SKT");

        smartPhone.connect();
        smartPhone.disconnect();
        Starlink.callAgency();

        // 형변환 후
        SmartPhone phone = (SmartPhone) smartPhone;
        phone.send();
        phone.receive();
        phone.encrypt();
    }
}
