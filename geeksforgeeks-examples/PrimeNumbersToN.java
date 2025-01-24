package com.example.basics;

import java.util.Scanner;

public class PrimeNumbersToN {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        System.out.println("Prime numbers from 1 to " + n + ":");

        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }


    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

