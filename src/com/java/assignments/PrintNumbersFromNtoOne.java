package com.java.assignments;

import java.util.Scanner;

public class PrintNumbersFromNtoOne {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int N = scanner.nextInt();
        int number = N;
        while (number >= 1){
            System.out.println(number);
            number--;
        }
    }
}
