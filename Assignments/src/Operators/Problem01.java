package Operators;
/*
(Convert Celsius to Fahrenheit) Write a program that reads a Celsius degree in
a double value from the console, then converts it to Fahrenheit and displays the
result. The formula for the conversion is as follows:
fahrenheit = (9 / 5) * celsius + 32
*/

import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Celsius");
        double Celsius = sc.nextDouble();

//Fahrenheit conversion
        double Fahrenheit = ((9/5.0) * Celsius) + 32;
        System.out.println("The Fahrenheit value is " + Fahrenheit);
    }
}
