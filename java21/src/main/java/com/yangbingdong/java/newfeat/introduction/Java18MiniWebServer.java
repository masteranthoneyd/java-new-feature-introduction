package com.yangbingdong.java.newfeat.introduction;

import com.sun.net.httpserver.SimpleFileServer;

import java.net.InetSocketAddress;
import java.nio.file.Path;

/**
 * @author yangbingdong1994@gmail.com
 */
public class Java18MiniWebServer {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        var addr = new InetSocketAddress(9000);
        var server = SimpleFileServer.createFileServer(
                addr, Path.of("/"), SimpleFileServer.OutputLevel.INFO);
        server.start();
    }
}
