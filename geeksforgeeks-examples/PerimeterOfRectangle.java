package com.example.basics;

public class PerimeterOfRectangle {
    static void perimeter(int length, int breadth) {
        int perimeter = 2 * (length + breadth);
        System.out.println("The perimeter of the given rectangle of length "
                + length + " and breadth " + breadth + " = "
                + perimeter);
    }

    public static void main(String[] args) {

        int length = 10;
        int breadth = 20;
        perimeter(length, breadth);
    }
}
