package week2homework;

import java.util.Scanner;

/**
 * Write a program to convert the upper case to lower case.
 */
public class Programme_9CovertUpperToLowerCase {

    public static void main(String[] args) {
//Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the uppercase string : ");
        String uppercase = scanner.nextLine();
        Programme_9CovertUpperToLowerCase t = new Programme_9CovertUpperToLowerCase();
        t.convertUppercaseToLowerCase(uppercase);
        // closing the scanner object
        scanner.close();
    }

    //Conversion of Uppercase to Lower case method
    public void convertUppercaseToLowerCase(String text) {
        System.out.println("The Lowercase valie is = " + text.toLowerCase());

    }


}
