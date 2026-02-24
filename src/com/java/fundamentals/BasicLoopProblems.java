package com.java.fundamentals;

import java.util.Scanner;
import java.util.Set;

public class BasicLoopProblems {
    static void main(String[] args) {

//        Printing Number From 1 to N

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Digit : ");
        int N = scanner.nextInt();

//        int N = 10;
        int number = 1;
        while (number <= N){
            System.out.println(number);
            number = number + 1;
        }


        //Printing Numbers From N to 1
//        int number = N;
//        while (number >= 1 ){
//            System.out.println(number);
//            number = number - 1;
//        }


        //        Print Even Numbers 1 to N

//        int number = 1;
//        while (number <= N){
//            if (number %2 == 0){
//                System.out.println(number);
//            }
//            number = number + 1;
//
//        }


        //Print Odd Numbers From N to 1

//        int number = 1;
//        while (number <= N){
//            if (number %2 == 1){
//                System.out.println(number);
//            }
//        number = number + 1;
//        }

    }
}
