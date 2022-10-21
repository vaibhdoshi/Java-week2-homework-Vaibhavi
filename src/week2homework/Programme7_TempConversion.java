package week2homework;

/* Write a program to insert any temperature value in degree Fahrenheit
 * and convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */

import java.util.Scanner;

public class Programme7_TempConversion {

    public static void main(String[] args) {

        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature in fahrenheit : ");
        float temp = scanner.nextFloat();
        // Object creation
        Programme7_TempConversion t = new Programme7_TempConversion();
        t.convertTemToDegreeCelsius(temp);
        // closing the scanner object
        scanner.close();


    }

    //Temperature conversion method
    public void convertTemToDegreeCelsius(float temp) {
        float c = ((temp - 32) * 5 / 9);
        System.out.println("The temperature " + temp + " fahrenheit is equal to " + c + " degree celsius");

    }


}