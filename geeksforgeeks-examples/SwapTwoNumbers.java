package com.example.basics;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int temp = 0;
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
