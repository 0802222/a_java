package com.grepp.oop.d_inheritance.c_after;


public class Run {

    // 다형성으로 디바이스, 컴퓨터, 오브젝트 타입 다 쓸 수 있음
    public static void main(String[] args) {
        Desktop desktop = new Desktop(
            "삼성",
            "갤럭시북",
            2000000,
            "intel",
            true
        );

//        Computer computer = desktop;
//        Device device = desktop;

        Computer smartphone = new SmartPhone(
            "사과",
            "아이폰",
            1300000,
            "긱벤치",
            "SKT"
        );

        Tv tv = new Tv(
            "삼성",
            "삼텐바이",
            1000000,
            52

        );


        Device[] devices = {desktop, smartphone, tv};
        for (Device device : devices){
            device.on();
            // 컴퓨터타입을 가진 인스턴스는 스위치를 켠 다음 메모리 정리 수행
            if(device instanceof Computer computer){
                // down casting : 선조타입을 후손타입으로 변환
                // up casting : 후손타입을 선조타입으로 변환
                // Computer computer = (Computer) device;
                computer.cleanUp();
            }
            device.on();
            System.out.println("============");
        }
    }
}
