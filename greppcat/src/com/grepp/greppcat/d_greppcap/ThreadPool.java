package com.grepp.greppcat.d_greppcap;

import com.grepp.greppcat.d_greppcap.servlet.ServletContainer;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;

public class ThreadPool {

    private static ThreadPool instance;
    private final List<Thread> threads = new ArrayList<Thread>();
    private final LinkedBlockingQueue<Socket> taskQueue = new LinkedBlockingQueue<Socket>();

    private ThreadPool(int threadCnt) {
        for (int i = 0; i < threadCnt; i++) {
            threads.add(new Thread(new ServletContainer(taskQueue)));
        }
        threads.forEach(Thread::start);
    }

    public static ThreadPool init(int threadCnt) {
        if (instance == null) {
            instance = new ThreadPool(threadCnt);
        }
        return instance;
    }

    public void addTask(Socket socket) {
        taskQueue.add(socket);
    }
}
