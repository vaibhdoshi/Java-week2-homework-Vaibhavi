package week2homework;

import java.util.Scanner;

/**
 * Write a program to enter any radius value of the circle and find out the area.(Formula of Area A=PI*r*r).
 */

public class Programme_6AreaofCircle {
    public static void main(String[] args) {
// //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Radius : ");
        double radius = scanner.nextDouble();
        areaOfCircle(radius);
// closing the scanner object
        scanner.close();
    }


    public static void areaOfCircle(double radius) {
        double pi = Math.PI;
        double area = (pi * radius * radius);
        System.out.println("The Area of Circle is : " + area);


    }

}
