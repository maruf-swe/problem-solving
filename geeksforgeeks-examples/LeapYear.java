package com.example.basics;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        System.out.println(isLeap(year));
    }

    public static boolean isLeap(int year) {
        boolean leap = false;

        if (year % 4 == 0) {
            if (year % 400 == 0) {
                leap = true;
            } else if (year % 100 == 0) {
                leap = false;
            } else {
                leap = true;
            }
        } else {
            leap = false;
        }

        return leap;
    }
}

