package com.java.assignments;

import java.util.Scanner;

public class CountDigitsInaNumber {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number : ");
        int number = scanner.nextInt();
        int count = 0;
//        for (int i=1; i<= number; i++){
          for (;number > 0; number = number / 10){
            count++;
        }
        System.out.println(count);


    }
}
