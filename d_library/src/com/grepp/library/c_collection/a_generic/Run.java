package com.grepp.library.c_collection.a_generic;

import static com.grepp.library.c_collection.a_generic.GenericArray.practiceGeneric;

import com.grepp.library.c_collection.a_generic.domain.Book;
import com.grepp.library.c_collection.a_generic.domain.Computer;
import com.grepp.library.c_collection.a_generic.domain.Device;
import com.grepp.library.c_collection.a_generic.domain.SmartPhone;
import com.grepp.library.c_collection.a_generic.domain.Tv;

public class Run {

    public static void main(String[] args) {
        Computer mac = new Computer("mac", "apple");
        Computer galaxyBook = new Computer("galaxyBook", "intel");
        SmartPhone iphone = new SmartPhone("iphone", "긱벤치", "SKT");
        SmartPhone galaxy = new SmartPhone("galaxy", "intel", "SKT");
        Book book = new Book("해리포터", "조앤롤링");
        Tv tv = new Tv("삼탠바이", 50);

        //제네릭 어레이에 담을 타입을 디바이스로 정함
        GenericArray<Device> devices = new GenericArray<>(2);
        devices.add(tv);
        devices.add(galaxyBook);

        //genericArray.add(book); //요구타입이 디바이스인데, 북 타입을 줘서 에러남
        //book 안에 배열에서 읽기와 추가만되는 배열이 완성됨(추가적인 클래스 없이)
        GenericArray<Book> books = new GenericArray<>(2);
        books.add(book);

        //get 반환타입이 device라서 디바이스 타입 메서드를 쓸 수 있음
        for (int i = 0; i < devices.size(); i++) {
            devices.get(i).on();
        }

        // 우리가 만든 static 을 이용해 제네릭객체 받아보는 연습
        // 제네릭 메서드를 사용할 때는 매개변수, 반환타입을 기반으로 컴파일러가 제네릭 타입을 추론해줌
        GenericArray<Device> g1 = GenericArray.<Device>practiceGeneric(mac);

        // T extends Device : Device 타입을 가지고 있지 않은 Book, Object 타입은 올 수 없다.
        //Device 타입을 받으라고 메시지 뜸
        //GenericArray<Book> g2 = GenericArray.<Book>practiceExtends(book);

        GenericArray<Device> g2 = GenericArray.<Device>practiceExtends(mac);



        // NOTE 04 Generic 은 무공변성이다. (casting 이 안됨)
        // 제네릭에서는 부모-후손간 형변환이 불가하며, 다른타입으로 본다 -> 무공변성 이다.
        // 공변성 : down casting 가능, 반공변성 : up casting 가능, 무공변성 : casting 불가

        // GenericArray<Device>는 GenericArray<Computer>의 상위타입이 아님
        //GenericArray<Device> g3 = GenericArray.<Computer>practiceExtends(mac);

        // NOTE 05 와일드 카드 : ? (와일드카드로 Generic casting 가능하게 해줌)
        // 규칙 : 제네릭 메서드에서는 사용할 수 없다.
        // 상한 경계 지정 : < ? extends T>
        // GenericArray<? extends Device> 이 Device의 후손타입을 제네릭 타입으로 가지는
        // GenericArray<T> 에 대한 상위타입이 된다(up casting 이 됨).
        GenericArray<? extends Device> g4 = GenericArray.<Computer>practiceExtends(mac);

        // NOTE 06 하한경계
        // < ? super T>
        // T 타입의 선조타입
        GenericArray<? super Computer> g5 = GenericArray.<Device>practiceGeneric(mac);
        //g5.add(mac);
        //g5.get(mac).
        //찍어보면 오브젝트로 꺼내짐, 타입을 지정하는 장점이 있긴함, 자료구조 형태로는 잘 안쓰고 중첩해서 어디에 넣어줄때 사용함
    }

}
