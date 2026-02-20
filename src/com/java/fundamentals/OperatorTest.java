package com.java.fundamentals;

public class OperatorTest {
    static void main(String[] args) {
        int no1 = 10, no2 = 20;
        // Arithmetic Operators
//        System.out.println(no1 + no2);
//        System.out.println(no1 - no2);
//        System.out.println(no1 * no2);
//        System.out.println(no1 / no2);
//        System.out.println(no1 % no2);

//        System.out.println(no1+= 10);
//        System.out.println(no1-= 10);
//        System.out.println(no1*= 10);
//        System.out.println(no1/= 10);
//        System.out.println(no1%= 10);
//
//        System.out.println(no2+= 11);
//        System.out.println(no2-= 11);
//        System.out.println(no2*= 11);
//        System.out.println(no2/= 11);
//        System.out.println(no2%= 11);

        int result;
        result = ++no1 - --no2 + no1++ - no2--  + ++no2;
        System.out.println(result);
        System.out.println(no1);
        System.out.println(no2);




    }
}
