package com.grepp.library.c_collection.d_map.grepp;

import com.grepp.library.c_collection.c_set.grepp._HashSet_p2;
import com.grepp.library.c_collection.z_domain.Node;
import java.util.Map.Entry;

//get 이 있는 set 을 만들기위해 엔트리셋 만듦
// hashset_p2에서 상속받아서 쓸애들은 protected로 열면됨
public class _EntrySet<E> extends _HashSet_p2<E> {

    //외부 막기, 내부에서 갖다쓰게끔
    _EntrySet(){

    }

    @Override
    public boolean add(E e) {
        if(get(e) != null){
            super.remove(e); // 있으면 덮어써지고, 없으면 추가
        }
        return super.add(e);
    }

    //entry에서 엘리먼트받아서 해당하는 값 반환 메서드 만들기
    public E get(E e){
        int index = hash(e);
        Node<E> head = (Node<E>) elementData[index];

        if(head == null) return null;
        if(head.equals(e)) return head.data();

        Node<E> link = head;
        while(link != null) {
            if(link.data().equals(e)){
                return link.data();
            }
            link = link.next();
        }

        return null;
    }
}
