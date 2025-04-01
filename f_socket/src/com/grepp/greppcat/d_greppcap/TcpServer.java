package com.grepp.greppcat.d_greppcap;

import java.io.IOException;
import java.net.ServerSocket;

public class TcpServer {

    private ServerSocket serverSocket;
    private ThreadPool threadPool;

    public TcpServer(int port, int threadCnt) {
        try {
            serverSocket = new ServerSocket(port);
            threadPool = ThreadPool.init(1);

            System.out.println("server start(prot : " + port + ")");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start() {
        while (true) {
            try {
                threadPool.addTask(serverSocket.accept());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}