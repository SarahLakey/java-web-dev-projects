package main.java.org.launchcode;

import main.java.org.launchcode.studios.Circle;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Length of the rectangle: ");
        int length = input.nextInt();
        System.out.println("Width of the rectangle: ");
        int width = input.nextInt();
        int area = area(length, width);
        System.out.println("The area of the rectangle is " + area);

    }

    public static int area(int length, int width) {
        return length * width;
    }
}
