package main.java.org.launchcode.studios;

import java.util.Scanner;

public class Areaofacircle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        int radius = input.nextInt();
        double result = area(radius);
        System.out.println("The area of a circle of radius " + radius + " is: " + result);
    }

    public static double area(double radius){
//        return 3.14 * radius * radius;
        return  Circle.getArea(radius);
    }
}