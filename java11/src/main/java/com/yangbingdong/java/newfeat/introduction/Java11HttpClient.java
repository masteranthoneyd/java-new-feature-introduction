package com.yangbingdong.java.newfeat.introduction;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Java11HttpClient {

    public static void main(String[] args) throws IOException, InterruptedException {
        var request = HttpRequest.newBuilder()
                .uri(URI.create("https://blog.yangbingdong.com/sitemap.xml"))
                .GET()
                .build();
        var client = HttpClient.newHttpClient();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());

        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenAccept(System.out::println)
                .join();

    }
}
