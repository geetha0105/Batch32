package Class_Objects;

/**
 * Write a program to print the area of two rectangles having
 * sides (4,5) and (5,8) respectively by creating a class
 * named 'Rectangle' with a method named 'Area' which returns
 * the area and length and breadth passed as parameters to its
 * constructor.
 */

public class Rectangle {
    int length;
    int breadth;

//Constructor created for Rectangle class
    Rectangle(int l, int b){
        length = l;
        breadth = b;
    }

//Method to calculate the area of the triangle and return the result
    int Calculate_Area(){
        int Area = length * breadth;
        return Area;

    }
}
