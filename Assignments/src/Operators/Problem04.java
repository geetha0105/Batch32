package Operators;
/*
Write a program that converts pounds into kilograms.
The program prompts the user to enter a number in pounds, converts it
to kilograms, and displays the result. One pound is 0.454 kilograms.
*/

import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        final double ONE_POUND = 0.454;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 'pounds'");
        double POUND = sc.nextDouble();

//Conversion of pounds to kilograms
      double KILOGRAMS = POUND * ONE_POUND;
        System.out.println(POUND + " POUND is " + KILOGRAMS + " kilograms");




    }
}
