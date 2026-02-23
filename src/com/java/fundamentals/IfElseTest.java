package com.java.fundamentals;

import java.util.Scanner;

public class IfElseTest {
    static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter number1 ");
//        int number1 = scanner.nextInt();
//
//        System.out.println("Enter number2");
//        int number2 = scanner.nextInt();
//
//        if (number1 > number2){
//            System.out.println(number1 + "is Greater");
//        }else if (number1 == number2){
//            System.out.println("Both" + number1 + "and" + number2 + "are same" );
//        } else{
//            System.out.println(number2 + " Is greater");
//        }


        // Greater in three numbers
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num1 ");
        int num1 = scanner.nextInt();

        System.out.println("Enter num2");
        int num2 = scanner.nextInt();

        System.out.println("Enter num3");
        int num3 = scanner.nextInt();

        if (num1 > num2 && num1 > num3){
            System.out.println(num1 + "is Greater");
        }else if (num2 > num3){
            System.out.println(num2 + "is Greater" );
        } else{
            System.out.println(num3 + " Is greater");
        }




    }
}




