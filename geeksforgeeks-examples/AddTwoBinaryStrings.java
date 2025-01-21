package com.example.basics;

public class AddTwoBinaryStrings {
    static String add_Binary(String x, String y) {
        int num1 = Integer.parseInt(x, 2);
        int num2 = Integer.parseInt(y, 2);
        int sum = num1 + num2;
        return Integer.toBinaryString(sum);
    }

    public static void main(String args[]) {
        String x = "011011", y = "1010111";
        System.out.print(add_Binary(x, y));
    }
}

