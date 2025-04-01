package com.grepp.library.c_collection.b_list.grepp;

import java.util.Iterator;
import java.util.NoSuchElementException;

@SuppressWarnings("unchecked") //원하는 경고문구를 무시할 수 있는 어노테이션
public class _ArrayList<E> implements Iterable<E>, _List<E> {

    private Object[] elementData;
    private static final int DEFAULT_CAPACITY = 10;
    private int pointer;
    private int arraySize; //내부 배열크기 용도

    public _ArrayList() {
        elementData = new Object[DEFAULT_CAPACITY];
        arraySize = DEFAULT_CAPACITY;
    }

    public boolean add(E e) {
        if (pointer < arraySize) {
            elementData[pointer] = e;
            pointer++;
            return true;
        }
        //가득차면 크기가 큰 배열을 만들어줌
        arraySize *= 2; //20이 됨
        Object[] temp = new Object[arraySize];

        for (int i = 0; i < pointer; i++) {
            temp[i] = elementData[i];
        }

        temp[pointer] = e;
        elementData = temp;
        pointer++;
        return true;
    }


    // 삭제 메서드 구현 (인덱스)
    public E remove(int index) {
        if (index < 0 || index >= arraySize) {
            throw new IndexOutOfBoundsException();
        }

        E removedElement = (E) elementData[index]; //삭제할 요소 저장

        // 삭제된 요소 뒤의 요소를 앞으로 한칸씩 이동
        for (int i = index; i < arraySize -1; i++) {
            elementData[i] = elementData[i + 1];
        }

        elementData[arraySize - 1] = null; // 마지막 요소 제거
        arraySize--; // 크기감소
        return removedElement; // 삭제된 요소 반환
    }




    public E get(int index) {
        if (index < 0 || index >= pointer)
            throw new IndexOutOfBoundsException("인덱스 범위를 벗어났습니다.");
        return (E) elementData[index];
    }


    public int size() {
        return pointer;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {

            private int pointer;

            @Override
            public boolean hasNext() {
                return pointer < size();
            }

            @Override
            public E next() {
                if (pointer >= size())
                    throw new NoSuchElementException();
                E e = get(pointer);
                pointer++;
                return e;
            }
        };
    }


}