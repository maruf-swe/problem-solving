package com.example.basics;

import java.util.Scanner;

public class VowelOrConstant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);
        checkVowelOrConstant(ch);
    }

    public static void checkVowelOrConstant(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("User input is vowel");
        } else {
            System.out.println("User input is constant");
        }
    }
}
