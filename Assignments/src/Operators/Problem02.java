package Operators;

/*
(Compute the volume of a cylinder) Write a program that reads in the radius
and length of a cylinder and computes the area and volume using the following
formulas:
area = radius * radius * pi
volume = area * length
*/

import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the cylinder");
        double radius = sc.nextFloat();
        System.out.println("Enter the length of the cylinder");
        double length = sc.nextFloat();
        final double PI = 3.14159265359;

//Computing the area and volume of the cylinder with Math function
         double Area = (double)(Math.PI * Math.pow(radius,2));
        System.out.println("The area of the cylinder with radius " + radius + " " + "is " + Area);

        double Volume = Area * length;
        System.out.println("The volume of the cylinder with radius " + radius + " " + "and length " + length + " " + "is " + Volume);


//Computing the area and volume of the cylinder with final double value of PI
        double Area1 = PI * (double)Math.pow(radius,2);
        System.out.println("The area of the cylinder with radius " + radius + " " + "is " + Area1);

        double Volume1 = Area * length;
        System.out.println("The volume of the cylinder with radius " + radius + " " + "and length " + length + " " + "is " + Volume1);


    }
}
