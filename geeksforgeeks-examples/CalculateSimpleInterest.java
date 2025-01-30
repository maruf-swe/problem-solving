package com.example.basics;

/*
Simple Interest = (P x T x R)/100
Where,
P is the principal amount
T is the time and
R is the rate
 */

public class CalculateSimpleInterest {
    public static void main(String args[]) {
        float P = 1, R = 1, T = 1;
        float SI = (P * T * R) / 100;
        System.out.println("Simple interest = " + SI);
    }
}