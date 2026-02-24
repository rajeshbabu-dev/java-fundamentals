package com.java.assignments;

import java.util.Scanner;

public class SumOfEvenNumbersOneToN {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number :");
        int number = scanner.nextInt();
        int sum = 0;
        for (int i=1; i<=number; i++){
            if (i%2==0){
                sum = sum+i;
            }
        }

        System.out.println(sum);
    }
}
