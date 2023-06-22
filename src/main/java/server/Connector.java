package server;

import java.io.IOException;
import java.net.ServerSocket;

public class Connector implements Runnable{
    private static ServerSocket serverSocket;

    @Override
    public void run() {
        try {
            serverSocket = new ServerSocket(Server.getPort());

            // TO DO: implement logging
            while (!serverSocket.isClosed()) {

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
