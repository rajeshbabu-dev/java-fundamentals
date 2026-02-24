package com.java.assignments;

import java.util.Scanner;

public class PrintEvenNumbersFromOneToN {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int N = scanner.nextInt();
        for ( int i=1; i<=N; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
