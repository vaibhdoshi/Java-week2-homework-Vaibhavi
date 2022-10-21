package week2homework;

import java.util.Scanner;

/**
 * Write a Java program to swap two variables.
 */


public class Programme_15SwapTheValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first variable value : ");
        int first = scanner.nextInt();
        System.out.println("Enter the second variable value : ");
        int second = scanner.nextInt();
        Programme_15SwapTheValue t = new Programme_15SwapTheValue();
        t.swapTheValue(first, second);
        // closing the scanner object
        scanner.close();


    }

    //Swapping the value of variables
    public void swapTheValue(int a, int b) {
        int c;
        System.out.println("Before the swapping,the values of first variable is: " + a + " and the second variable is : " + b);
        c = a;
        a = b;
        b = c;
        System.out.println("After the swapping,The values if first variable is  :  " + a + " and second variable is : " + b);

    }


}
