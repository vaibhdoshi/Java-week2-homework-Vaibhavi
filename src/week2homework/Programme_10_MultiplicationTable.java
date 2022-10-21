package week2homework;
/*Write a Java program that takes a number as input and prints its
multiplication table up to 10.
Test Data: Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80
*/


import java.util.Scanner;

public class Programme_10_MultiplicationTable {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number : ");
        int number = scanner.nextInt();
        multiplocationTableOf(number);
        // closing the scanner object
        scanner.close();

    }

    // Printing the multiplication table of entered number
    public static void multiplocationTableOf(int number) {
        System.out.println(number + "X " + 1 + " = " + (number));
        System.out.println(number + "X " + 2 + " = " + (number));
        System.out.println(number + "X " + 3 + " = " + (number));
        System.out.println(number + "X " + 4 + " = " + (number));
        System.out.println(number + "X " + 5 + " = " + (number));
        System.out.println(number + "X " + 6 + " = " + (number));
        System.out.println(number + "X " + 7 + " = " + (number));
        System.out.println(number + "X " + 8 + " = " + (number));
        System.out.println(number + "X " + 9 + " = " + (number));
        System.out.println(number + "X " + 10 + " = " + (number));


    }

}
