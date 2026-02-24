package com.java.assignments;

import java.util.Scanner;

public class PrintOddNumbersFromNToOne {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int N = scanner.nextInt();
        for (int i=N; i>=1; i--){
            if (i % 2 == 1){
                System.out.println(i);
            }
        }

    }
}
