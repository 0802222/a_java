package com.grepp.library.c_collection.e_stack;

import java.util.Stack;

public class Run {

    public static void main(String[] args) {
        //java.util.stack에가면 자료구조 다 만들어 놨음
        //pop(), push(), peek() 만들어볼 예정

        _Stack<Integer> stack = new _Stack<>();
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
        System.out.println("peek : " + stack.peek());

        //foreach면 순차적으로 빼내짐(역순으로 구현해야되는데 스텍이면)
        for (int i = 0; i < 10; i++) {
            System.out.println("stack : " + stack);
            System.out.println("pop : " + stack.pop());
        }
    }
}
