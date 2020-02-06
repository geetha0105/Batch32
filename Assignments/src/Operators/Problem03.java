package Operators;

import java.util.Scanner;

/*
(Convert feet into meters) Write a program that reads a number in feet, converts it
to meters, and displays the result. One foot is 0.305 meter. Here is a sample run:
*/
public class Problem03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 'feet' ");
        double feet = sc.nextDouble();

        final double METERS_PER_FOOT = 0.305;

//calculating the conversion of feet to meters
        double meters = feet * METERS_PER_FOOT;
        System.out.println(feet + " feet is " + meters + " meters");

    }
}
