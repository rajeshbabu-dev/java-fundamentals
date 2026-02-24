package com.java.assignments;

import java.util.Scanner;

public class PrintNumbersFromOneToN {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int N = scanner.nextInt();
        int number = 1;
        while (number <= N){
            System.out.println(number);
            number++;
        }

    }
}
