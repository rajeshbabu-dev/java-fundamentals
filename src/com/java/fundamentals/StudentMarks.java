package com.java.fundamentals;

import java.util.Scanner;

public class StudentMarks {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter subject1 Marks");
        byte subject1Marks = scanner.nextByte();

        System.out.println("Enter subject2 Marks");
        byte subject2Marks = scanner.nextByte();

        System.out.println("Enter subject3 Marks");
        byte subject3Marks = scanner.nextByte();

        System.out.println("Enter subject4 Marks");
        byte subject4Marks= scanner.nextByte();

        System.out.println("Enter subject5 Marks");
        byte subject5Marks = scanner.nextByte();

        System.out.println("Subject 1 Marks : " + subject1Marks);
        System.out.println("Subject 2 Marks : " + subject2Marks);
        System.out.println("Subject 3 Marks : " + subject3Marks);
        System.out.println("Subject 4 Marks : " + subject4Marks);
        System.out.println("Subject 5 Marks : " + subject5Marks);

        int averagemarks = (subject1Marks + subject2Marks + subject3Marks + subject4Marks + subject5Marks)/5;
        System.out.println("Average Marks : " + averagemarks);

        if (averagemarks > 80)
            System.out.println("Student Grade Is A");
        else if (averagemarks >= 70) {
            System.out.println("Student Grade Is B");

        } else if (averagemarks >= 60) {
            System.out.println("Student Grade Is C ");
        } else if (averagemarks >= 50) {
            System.out.println("Student Grade Is D");
        }else if (averagemarks >= 40) {
            System.out.println("Student Grade Is E");
        }else if (averagemarks >= 35) {
            System.out.println("Student Grade Is F");
        }else
            System.out.println("Failed - Do Better Next Time");
    }
}
