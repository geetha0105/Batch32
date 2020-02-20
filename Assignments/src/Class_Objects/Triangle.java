package Class_Objects;

/**
 * Write a program to print the area and perimeter of a triangle
 * having sides of 3, 4 and 5 units by creating a class named
 * 'Triangle' without any parameter in its constructor.
 */

/**
 * Print the average of three numbers entered by user by
 * creating a class named 'Average' having a method to
 * calculate and print the average.
 *
 * Take the input using Scanner
 */

public class Triangle {
    private float Height;
    private float Base;
    private float Side3;

    //Constructor for the Triangle is created. This Constructor is created as a no argument constructor
    public Triangle() {
        this.Height = 3;
        this.Base = 4;
        this.Side3 = 5;
    }

    //Method to calculate the Area of the Triangle
    void Calculate_Area() {
        float Area = (0.5f * this.Height * this.Base);
        System.out.println("The Area of Triangle1 is " + Area);
    }

    //Method to calculate the Perimeter of the Triangle
    void Calculate_Perimeter() {
        float Perimeter = (this.Height + this.Base + this.Side3) / 3;
        System.out.println("The perimeter of Triangle1 is " + Perimeter);
    }
}

