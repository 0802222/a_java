package com.grepp.library.c_collection.b_list.grepp;

//p2를 바꿔서 해시함수만들어야됨, size건들일필요없고 add노드->링크드리스트로, tostring도(링크드리스트에 투스트링 만들면편함)

import com.grepp.library.c_collection.z_domain.Node;
import java.util.Iterator;
import java.util.NoSuchElementException;

//포이치문을 타려면 이터러블 타입을 갖고있어야함
public class _LinkedList<E> implements _List<E> {

    private Node<E> head;
    private int pointer;

    public int size(){
        return pointer;
    }

    public boolean isEmpty(){
        return pointer == 0;
    }



    public boolean add(E e){
        Node<E> current = new Node<E>(e);
        if(pointer == 0){
            head = current;
            pointer++;
            return true;
        }
        //탐색되는 다음노드의 주소값을 저장할 참조변수
        Node<E> link = head;
        while(link.next() != null){
            link = link.next();
        }

        link.setNext(current);
        pointer++;
        return true;
    }



    public E get(int index){
        if(index < 0 || index >= pointer) throw new IndexOutOfBoundsException();
        Node<E> link = head;
        for (int i = 0; i < index; i++) {
            link = link.next();

        }

        return link.data();
    }



    //수정 메서드
    public E set(int index, E e){
        if(index<0 || index>= pointer) throw new IndexOutOfBoundsException();

        Node<E> link = head;

        for (int i = 0; i < index; i++) {
            link = link.next(); //next에는 setnext에서 넣었던 다음값을 순차적으로 넣어줌
        }

        E modified = link.data();
        link.setData(e);
        return modified;
    }




    //삭제 메서드 (삭제할 요소의 앞, 뒤 노드를 알아야 하고, 그 둘을 연결해줘야함)
    public E remove(int index){
        if(index<0 || index>= pointer) throw new IndexOutOfBoundsException();

        // 탐색용 노드 생성
        Node<E> link = head;
        // 첫 노드는 헤드에서 연결을 끊어줘야함
        Node<E> prevNode = head;

        if(index == 0){
            head = head.next(); // 덮어쓰는 과정
            pointer--;
            return prevNode.data();
        }

        //삭제대상 노드 탐색
        for (int i = 0; i < index; i++) {
            prevNode = link; // 값을 저장해놔야지 나중에 반환할 수 있음
            link = link.next();
        }

        //삭제 대상 앞의 노드에 다음 타겟 노드를 넣어줌
        prevNode.setNext(link.next());
        pointer--;

        return link.data();
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node<E> current = head;
        while (current != null) {
            sb.append(current.data());
            if(current.next() != null) {
                sb.append(", ");
            }
            current = current.next();
        }

        sb.append("]");
        return sb.toString();
    }

    // contains 메서드 구현
    // 중복값이 있으면 add를 안하고 return
    public boolean contains(E e){
        Node<E> link = head;
        while(link != null){
            if(link.data().equals(e)){
                return true;
            }
            link = link.next(); //null이 아닐때까지 돌려서 마지막요소가 null이 담기도록
        }
        return false;
    }

    @Override
    public Iterator<E> iterator(){
        return new Iterator<E>(){
            private int pointer;

            @Override
            public boolean hasNext() {
                return pointer < size();
            }

            @Override
            public E next() {
                if (pointer >= size()) throw new NoSuchElementException();
                E e = get(pointer);
                pointer++;
                return e;
            }
        };
    }
}
