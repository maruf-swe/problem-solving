package com.example.basics;

public class SwapThreeNumbers {
    public static void main(String[] args) {
        int a, b, c, temp;
        a = 10;
        b = 20;
        c = 30;
        temp = a;
        a = b;
        b = c;
        c = temp;

        System.out.printf("%d %d %d", a, b, c);

    }
}
