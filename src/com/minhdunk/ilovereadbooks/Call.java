package com.minhdunk.ilovereadbooks;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;
import java.net.http.HttpRequest;

public class Call {
    public static void main (String[] args) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://googlebooksraygorodskijv1.p.rapidapi.com/getAccessToken"))
                .header("content-type", "application/x-www-form-urlencoded")
                .header("X-RapidAPI-Key", "87080a189cmshc63f8a9c0dd54dep1450bcjsne5f43bd04442")
                .header("X-RapidAPI-Host", "GoogleBooksraygorodskijV1.p.rapidapi.com")
                .method("POST", HttpRequest.BodyPublishers.ofString("redirectUri=%3CREQUIRED%3E&clientSecret=%3CREQUIRED%3E&clientId=%3CREQUIRED%3E&code=%3CREQUIRED%3E"))
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());

    }
}
