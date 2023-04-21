package org.example;

import java.util.Scanner;

public class HttpImageStatusCli {
    public static void askStatus(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter HTTP status code: ");
        if (scanner.hasNextInt()) {
            int statusCode = scanner.nextInt();
            String imageUrl = "https://http.cat/"+statusCode+".jpg";
            HttpStatusImageDownloader downloader = new HttpStatusImageDownloader();
                if (imageUrl != null) {
                    downloader.downloadStatusImage(statusCode);
                }
        } else {
            System.out.println("Please enter a valid number");
        }
    }
}
