package com.java.fundamentals;

import java.util.Scanner;

public class Practice1 {
    static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter Platform");
        String platform = scanner.next();

        System.out.println("Enter No Of Items");
        byte items = scanner.nextByte();

        System.out.println("Enter Price");
        short price = scanner.nextShort();

        System.out.println("Enter DiscountPercentage");
        float discountpercentage = scanner.nextFloat();

        System.out.println("Enter DeliveryCharges");
        byte deliverycharges = scanner.nextByte();

        System.out.println("Enter MaxRretail Price");
        short MaxRetailPrice = scanner.nextShort();

        System.out.println("EnterFinalPrice");


        float discountAmount = (MaxRetailPrice/100) * discountpercentage;
        double productPrice = MaxRetailPrice - discountAmount;
        double stateTax = productPrice * (3.5/100);
        double centralTax = productPrice * (3.5/100);
        double finalPrice = productPrice + stateTax + centralTax + deliverycharges;

        System.out.println("Entetr Max Retail Price :" + MaxRetailPrice);
        System.out.println("Enter Disccount Amount : " + discountAmount);
        System.out.println("Enter state Tax : " + stateTax);
        System.out.println("Enter central Tax : " + centralTax);
        System.out.println("final Price : " + finalPrice);
        System.out.println("Enter Delivery Charges : " + deliverycharges);


    }
}
