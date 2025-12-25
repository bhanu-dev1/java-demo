package com.example;

public class App {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Java App Running...");
            try {
                Thread.sleep(10000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

