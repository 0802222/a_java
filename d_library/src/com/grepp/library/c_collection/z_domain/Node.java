package com.grepp.library.c_collection.z_domain;

import java.util.Objects;

//다음 노드의 주소를 가져야돼서 제네릭타입을 가져야함
public class Node<E> {

    private Node<E> next;
    private E data;

    public Node(E data) {
        this.data = data;
    }

    //getter 안만들고 이렇게 만들어보려함
    public E data(){
        return data;
    }

    // 데이터 수정용으로 만들어서 열어줌
    public void setData(E data){
        this.data = data;
    }
    public Node<E> next(){
        return next;
    }

    public void setNext(Node<E> next){
        this.next = next;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Node<?> node)) {
            return false;
        }
        return Objects.equals(data, node.data);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(data);
    }

    @Override
    public String toString() {
        return data.toString();
    }
}
