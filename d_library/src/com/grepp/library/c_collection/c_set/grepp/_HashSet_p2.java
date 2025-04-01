package com.grepp.library.c_collection.c_set.grepp;

import com.grepp.library.c_collection.z_domain.Node;
import java.util.Arrays;
import java.util.Objects;
import javax.swing.text.html.HTMLDocument.HTMLReader.CharacterAction;

@SuppressWarnings("unchecked")
public class _HashSet_p2 <E>{
    private static final int DEFAULT_CAPACITY = 10;
    private int arraySize = 10;
    protected Object[] elementData;
    private int size;

    public _HashSet_p2() {
        elementData = new Object[DEFAULT_CAPACITY];

    }
    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    protected int hash(E e){
        // hashCode : -21억~ +21억
        // 절대값 : 0 ~ 21억 사이의 값 반환
        int hashCode = Math.abs(e.hashCode()); //Math.abs : 절대값표현
        return hashCode % arraySize; // 배열의 크기가 21억이니 나머지를 구하면 0~9까지 나온다 -> 해시충돌발생
    }


    private void resize() {
        arraySize *= 2;
        //임시배열 생성
        Object[] temp = new Object[arraySize];

        for (int i = 0; i < arraySize; i++) {
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


    @Override
    public int hashCode() {
        return Objects.hash(arraySize, Arrays.hashCode(elementData), size);
    }

    public boolean add(E e){
        Node<E> node = new Node<E>(e);

        if(size == arraySize -1){
            resize();
        }

        int index = hash(e);
        Node<E> head = (Node<E>) elementData[index];

        if(head == null){
            elementData[index] = node;
            size++;
            return true;
        }

        Node<E> link = head;
        while(link.next() != null){
            if(link.equals(node)) return false;
            link = link.next();
        }

        link.setNext(node);
        size++;
        return true;
    }


    public boolean remove(E e){
        int index =hash(e);

        Node<E> head = (Node<E>) elementData[index];

        if(head.data().equals(e)){
            elementData[index] = head.next();
            size--;
            return true;
        }
        Node<E> prevNode = head;
        Node<E> link = head;

        while(link.next() != null){
            prevNode = link;
            link = link.next();

            //링크가 뭐랑같은지 판단
            if(link.data().equals(e)){
                prevNode.setNext(link.next());
                size--;
                return true;
            }
        }

        return false; // 확인 : 메모리를 머리속으로 그려보기

    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("[");

        for (int i = 0; i < elementData.length; i++) {
            if(elementData[i] == null) continue; //컨티뉴해서 건너뛰기
            Node<E> link = (Node<E>) elementData[i];

            while (link.next() != null){
                sb.append(link.data()).append(",");
                link = link.next();
            }
            sb.append(link.data());
            if(i != elementData.length-1) sb.append(",");
        }

        sb.append("]");
        return sb.toString();
    }
}
