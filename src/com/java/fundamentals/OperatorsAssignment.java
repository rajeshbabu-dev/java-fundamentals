package com.java.fundamentals;

import java.util.Scanner;

public class OperatorsAssignment {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter Product Id");
        byte id;
        id = scanner.nextByte();

        System.out.println("Product name");
        String name;
        name = scanner.next();


        System.out.println("maxRetailPrice");
        int maxRetailprice;
        maxRetailprice = scanner.nextInt();

        System.out.println("enterDisccountPercentage");
        float discountpercentge;
        discountpercentge = scanner.nextFloat();

        System.out.println("enterFinalprice");

        float discountAmount = (maxRetailprice/100) * discountpercentge;
        double productPrice = maxRetailprice - discountAmount;
        double stateTax = productPrice * (2.5/100);
        double centralTax = productPrice * (2.5/100);
        double finalPrice = productPrice + stateTax + centralTax;

        System.out.println("maxRetailprice : " + maxRetailprice);
        System.out.println("discountAmount : " + discountAmount);
        System.out.println("stateTax : " + stateTax);
        System.out.println("centralTax : " + centralTax);
        System.out.println("productFinalPrice : " + finalPrice);


    }
}
