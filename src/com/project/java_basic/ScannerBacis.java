package com.project.java_basic;

import java.util.Scanner;

public class ScannerBacis {
    public static void main(String[] args) {
        Scanner MC = new Scanner(System.in);
        System.out.println("Input your number");
        double number = MC.nextDouble();
        System.out.println("your number: "+ number);
    }
}
