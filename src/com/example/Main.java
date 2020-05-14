package com.example;

public class Main {

    public static void main(String[] args) {

        Screenshot screenshot = new Screenshot("pic.jpg");
        try {
            screenshot.getScreenshot(100);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
