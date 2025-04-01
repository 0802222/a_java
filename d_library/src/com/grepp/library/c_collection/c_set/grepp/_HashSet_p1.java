package com.grepp.library.c_collection.c_set.grepp;

import java.util.Arrays;

public class _HashSet_p1<E> {

    // add, remove, Iterable
    // HashSet은 3단계로 진행
    // 1. 해시알고리즘으로 데이터 저장,
    // 2.해시알고리즘대로 동작하지않는 문제(해시충돌) 해결
    // 3. 노드로 만들었던걸 링크드 리스트 활용해서 리팩토링 -> 숙제

    private static final int DEFAULT_CAPACITY = 10;
    private int arraySize = 10;
    private Object[] elementData;
    private int size;

    public _HashSet_p1() {
        this.elementData = new Object[DEFAULT_CAPACITY];
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    // 배열에 저장한 인덱스를 해시함수를 통해서 구한다.
    private int hash(E e){
        // hashCode : -21억~ +21억
        // 절대값 : 0 ~ 21억 사이의 값 반환
        int hashCode = Math.abs(e.hashCode()); //Math.abs : 절대값표현
        return hashCode % arraySize; // 배열의 크기가 21억이니 나머지를 구하면 0~9까지 나온다 -> 해시충돌발생
    }

    public boolean add(E e){
        //set 의 특징 : 중복을 허용하지 않는다.
        if(size == arraySize-1){ //가득차기 일보직전에 확장하는걸로~
            resize();
        }

        int index = hash(e);


        if(elementData[index] != null){
            // 같은객체가 들어와서 같은값으로 저장했다면 false반환
            // list 라면 같은값이 추가되어서 true반환되었을듯
            return false;
        }
        elementData[index] = e;
        size++;
        return true;
    }

    // 삭제 메서드 생성
    public boolean remove(E e){
        int index = hash(e);
        if(elementData[index] == null) return false;
        // null이 아니라면 size 1추가
        elementData[index] = null;
        size--;
        return true;
    }

    @Override
    public String toString(){
        return Arrays.toString(elementData);
    }

    private void resize() {
        arraySize *= 2;
        //임시배열 생성
        Object[] temp = new Object[arraySize];

        for (int i = 0; i < elementData.length; i++) {
            // hash 값을 쓰면 순서보장이 안됨(나머지 값으로 들어오니까 뒤죽박죽)
            // 어레이처럼 쭈르륵 옮겨담을 수 가 없음
            // 기존 인덱스도 늘어난 새로운 배열( 20칸)을 기준으로 옮겨담아야됨
            // 원래 set의 75%가 차면 확장하긴함
            if(elementData[i] == null) continue;
            int newIndex = hash((E) elementData[i]);
            temp[i] = elementData[i];
        }
        elementData = temp;
        //temp 배열을 옮김
    }
}
