package Class_Objects;
//* Write a program to print the area and perimeter of a triangle
//* having sides of 3, 4 and 5 units by creating a class named
//* 'Triangle' with constructor having the three sides as its
//         * parameters.

public class Triangle1 {
    private float Height;
    private float Base;
    private float Side3;

    //Creating a Constructor for instance variables
    public Triangle1(float Height, float Base, float Side3) {
        this.setHeight(Height);
        this.setBase(Base);
        this.setSide3(Side3);
    }
//Setters for Height, Base and Side3
    public void setHeight(float height) {
        Height = height;
    }

    public void setBase(float base) {
        Base = base;
    }

    public void setSide3(float side3) {
        Side3 = side3;
    }

    //Method to Calculate the Area
    public void Calculate_Area() {
        float Area = 0.5f * Height * Base;
        System.out.println("The Area of Triangle1 is " + Area);
    }

    //Method to Calculate the Perimeter
    public void Calculate_Perimeter() {
        float Perimeter = (Height + Base + Side3) / 3;
        System.out.println("The perimeter of Triangle1 is " + Perimeter);
    }
}
