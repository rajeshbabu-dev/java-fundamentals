package com.java.fundamentals;

import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class SwitchTest {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1.Telugu");
        System.out.println("2.Hindi");
        System.out.println("3.English");
        System.out.println("4.Tamil");
        System.out.println("5.Others");

        System.out.println("Choose Your Language");
        byte number = scanner.nextByte();

        switch (number){
            case 1:
                System.out.println("Continue In Telugu");
                break;

            case 2:
                System.out.println("Continue In Hindi");
                break;

            case 3:
                System.out.println("Continue In English");
                break;

            case 4:
                System.out.println("Continue In Tamil");
                break;

            case 5:
                System.out.println("Continue In Others");
                break;

            default:
                System.out.println("Invalid - Choose Correct Option");
        }
    }
}
