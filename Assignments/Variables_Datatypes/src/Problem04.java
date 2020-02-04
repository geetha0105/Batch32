/*
(Area and perimeter of a circle) Write a program that displays the area and perimeter
of a circle that has a radius of 5.5 using the following formula:
					perimeter = 2 * radius * pi
					area = radius * radius * pi
SUGGESTIONS:
Use Math.PI for the pi value
*/

import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        float Radius = sc.nextFloat();

//Calculating the Perimeter
       float perimeter = (float) (2 * Math.PI * Radius);
        System.out.println("The perimeter of the circle is " + perimeter);

//Calculating the area
       float area = (float)Math.PI * (float) (Math.pow (Radius, 2));
        System.out.println("The area of the circle is " + area);




    }


}
