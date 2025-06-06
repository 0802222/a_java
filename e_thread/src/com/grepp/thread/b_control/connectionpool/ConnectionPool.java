package com.grepp.thread.b_control.connectionpool;

import java.util.LinkedList;
import java.util.Queue;

public class ConnectionPool {

    Queue<Connection> pool = new LinkedList<Connection>();

    public ConnectionPool(int cnt) {
        for (int i = 0; i < cnt; i++) {
            pool.add(new Connection("connection-" + i));
        }
    }

    // NOTE B02 : synchronized
    // 쓰레드가 synchronized 예약어가 선언된 메서드의 로직을 수행하는 동안
    // 해당 메서드를 가진 인스턴스에 다른 쓰레드가 접근할 수 없도록 차단 해준다. (lock 을 걸어준다.)
    public synchronized Connection getConnection(){
        if(pool.isEmpty()){
            try {
                // NOTE B03 : wait
                // getConnection 을 호출한 스레드를 일시정지
                wait();
            } catch (InterruptedException ignored) {

            }
        }
        return pool.poll(); //큐는 선입선출
    }

    public synchronized void returnConnection(Connection connection){
        pool.add(connection);
        // wait 에 의해 일시정지가 된 모든 thread 를 실행대기 상태로 변경
        notifyAll();
    }
}
