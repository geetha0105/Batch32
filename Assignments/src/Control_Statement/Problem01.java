package Control_Statement;

import java.util.Scanner;

/*
Determine If Year Is Leap Year Java Example
This Determine If Year Is Leap Year Java Example shows how to
determine whether the given year is leap year or not.
*/
public class Problem01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the YEAR");
        int YEAR = sc.nextInt();

//Calculating LEAP YEAR -- Approach1

        if (YEAR % 4 == 0) {
            if (YEAR % 100 == 0) {
                if (YEAR % 400 == 0) {
                    System.out.println("THE YEAR " + YEAR + " is a leap year");
                } else {
                    System.out.println("THE YEAR " + YEAR + " is not a leap year");
                }
            } else {
                System.out.println("THE YEAR " + YEAR + " is a leap year");
            }
        } else {
            System.out.println("THE YEAR " + YEAR + " is not a leap year");
        }

//Calculating LEAP YEAR -- Approach2

        if (YEAR % 400 == 0 || (YEAR % 4 == 0 && YEAR % 100 != 0)) {
            System.out.println("THE YEAR " + YEAR + " is a leap year");
        } else {
            System.out.println("THE YEAR " + YEAR + " is not a leap year");
        }
    }
}