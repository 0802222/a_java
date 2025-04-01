package com.grepp.library.c_collection.a_generic;

import com.grepp.library.c_collection.a_generic.domain.Device;


// 캡슐화
// NOTE A01 : Generic
// 클래스 외부에서 클래스 내부에서 사용할 타입을 결정하는 것
// 클래스 산언부나 메서드 선언부에 <Generic 매개변수>를 선언해 사용 가능
// Generic 은 여러개 사용할 수 있다.
// <> 매개변수 안에 아무이름이나 넣어도된다.
// (자주사용하는 이름 : E element, K key, V value T type S second, U 3번째, V 4번째)
public class GenericArray<E> {

    private Object[] elements;
    private int size;
    private int pointer;

    public GenericArray(int size) {
        this.size = size;
        elements = new Object[size];
    }

    // NOTE 02 : 제네릭 메서드
    //static 을 붙이면 제네릭을 만들어서 쓰는게 됨
    // 클래스 매개변수와 메서드 매개변수명이 겹칠때, 가까이에 있는 메서드 변수명을 갖다쓰게됨
    public static <T> GenericArray<T> practiceGeneric(T e){
        GenericArray<T> instance = new GenericArray<>(10);
        instance.add(e);
        return instance;
    }

    // NOTE 03 타입 한정 키워드(<매개변수 + extends + 타입명>)
    // T extends Device : Device 타입을 포함한 후손 타입 만 제네릭으로 지정해줄 수 있음
    public static <T extends Device> GenericArray<T> practiceExtends(T e){
        GenericArray<T> instance = new GenericArray<>(10);
        instance.add(e);
        return instance;
    }






    public int size(){
        return size;
    }

    //디바이스 타입의 인스턴스만 받아옴 -> 제네릭으로 외부에서 결정한 타입의 인스턴스만 받도록 설정함
    public void add(E e){
        if(pointer == size){
            System.out.println("용량이 부족합니다.");
            return;
        }
        elements[pointer] = e;
        pointer++;
    }

    //디바이스 꺼내가는 get 메서드
    public E get(int idx){
        if(idx < 0 || idx>= size) throw new IndexOutOfBoundsException();
        // (E)로 강제 다운캐스팅해서 외부에서 받은 배열로 리턴해줌
        return (E) elements[idx];
    }
}
