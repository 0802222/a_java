package com.grepp.library.c_collection.f_queue;

import java.util.LinkedList;
import java.util.Queue;

public class Run {

    public static void main(String[] args) {
        //offer (넣기) poll(삭제)
        _Queue<Integer> queue = new _Queue<>();

        for (int i = 0; i < 10; i++) {
            queue.offer(i);
        }
        //나간애 확인하기 (픽은 0을꺼내도 탑이 사라지지 않는다?)
        System.out.println("peek : " + queue.peek());


        for (int i = 0; i < 10; i++) {
            System.out.println(queue);
            System.out.println(queue.poll());
        }
    }
}
