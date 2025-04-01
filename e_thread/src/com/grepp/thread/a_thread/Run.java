package com.grepp.thread.a_thread;

import com.grepp.thread.a_thread.runnable.RunnableImpl;

public class Run {

    public static void main(String[] args) {

        // main 쓰레드 이름
        // run class에는 getName 메서드가 없어서 이렇게불러옴
        System.out.println(Thread.currentThread().getName());

        _Thread t1 = new _Thread();
        t1.setName("hello Thread");

        Thread t2 = new Thread(new RunnableImpl());
        t2.setName("hello Runnable");

        // NOTE EA03 : Daemon thread
        // 일반 쓰레드를 보조하는 목적으로 생성하는 쓰레드
        // 모든 일반 쓰레드가 종료되면 자도응로 데몬 쓰레드도 종료
        t2.setDaemon(true);

        // t1 쓰레드 실행
        t1.start();
        t2.start();

        System.out.println("===============");
        System.out.println("main Thread 종료");
        System.out.println("===============");
    }

}
