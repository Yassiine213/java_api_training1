package fr.lernejo.server;

import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.concurrent.Executors;

public class MyServer {

    public void begin() throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress("localhost", 9876), 0);
        server.setExecutor(Executors.newFixedThreadPool(1));
        server.createContext("/ping", new HttpHandlerHomeMade());
        server.start();
    }

}
