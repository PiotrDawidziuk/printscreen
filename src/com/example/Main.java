package com.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input  = new Scanner(System.in);
        String fileName = "";
        System.out.println("Enter file name: ");
        fileName = input.next();

        Screenshot screenshot = new Screenshot(fileName+".jpg");
        try {
            screenshot.getScreenshot(0);
            System.out.println(fileName+".jpg created");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
