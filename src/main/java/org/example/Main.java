package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(HttpStatusChecker.getStatusImage(201));
        HttpStatusImageDownloader.downloadStatusImage(201);
        HttpImageStatusCli.askStatus();
    }
}