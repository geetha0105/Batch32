package Class_Objects;

import java.util.Scanner;

public class Main_Class_Triangle1 {
    public static void main(String[] args) {

        //Using Scanner to get the inputs from the user
        System.out.println("Enter the Height, Base and Side3 of the triangle");
        Scanner sc = new Scanner(System.in);
        float Height;
        float Base;
        float Side3;
        Height = sc.nextFloat();
        Base = sc.nextFloat();
        Side3 = sc.nextFloat();

        //Creating the object and passing the parameters
        Triangle1 Triangle1 = new Triangle1(Height, Base, Side3);

        //Calling the methods that calculate the Area and Perimeter of the Triangle
        Triangle1.Calculate_Area();
        Triangle1.Calculate_Perimeter();
    }
}
