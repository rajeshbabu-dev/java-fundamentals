package com.java.fundamentals;

import java.util.Scanner;

public class ProductInput {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter name");
        String name;
        name = scanner.next();

        System.out.println("enter Product Id");
        byte id;
        id = scanner.nextByte();

        System.out.println("manufactured Year");
        short manufacturedYear;
        manufacturedYear = scanner.nextShort();

        System.out.println("maxRetailPrice");
        int maxRetailprice;
        maxRetailprice = scanner.nextInt();

        System.out.println("enterDisccountPercentage");
        float discountpercentge;
        discountpercentge = scanner.nextFloat();

        System.out.println("enterFinalprice");
        double finalPrice;
        finalPrice = scanner.nextDouble();

        System.out.println("enterCategory");
        char category = scanner.next().charAt(0);

        System.out.println("isStockAvailabe");
        boolean isStockAvailable;
        isStockAvailable = scanner.nextBoolean();

        System.out.println("Name : " + name);
        System.out.println("Enter Product Id : " + id);
        System.out.println(" Enter Manufactured Year : " + manufacturedYear);
        System.out.println("Enter maxRetailprice : " + maxRetailprice);
        System.out.println("Enter Discount Percentage : " + discountpercentge);
        System.out.println("Enter Final Price : " + finalPrice );
        System.out.println("Enter category : " + category);
        System.out.println("is Product Available (true/false) : " + isStockAvailable );
    }
}
