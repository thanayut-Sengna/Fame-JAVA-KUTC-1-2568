package com.project.java_basic;

import java.util.Scanner;

public class Checkpoint {
    public static void main(String[] args) {
        System.out.println(5 + 10 +  " is the result");
        System.out.println("Java" + 1 + 2);
        Scanner MC= new Scanner(System.in);
        System.out.println("Input your Scoll");
        int number = MC.nextInt();
        System.out.println("your number: "+ number);
        if (number > 100 ){
            System.out.println("ERROR");
        }
        else if (number >76){
            System.out.println("คะแนนของคุณคือ: H");
        }else if (number >60){
            System.out.println("คะแนนของคุณคือ: S");
        }else if (number <=60){
            System.out.println("คะแนนของคุณคือ: U");
        }
    }
}
