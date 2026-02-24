package com.java.assignments;

import java.util.Scanner;

public class MultiplicationOfaNumber {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number :");
        int number = scanner.nextInt();
        for (int i=1; i <= 10; i++){
            System.out.println(number + "*" + i + "=" + (number*i));
        }
    }
}
