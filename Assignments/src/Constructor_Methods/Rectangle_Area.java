package Constructor_Methods;

import Class_Objects.Rectangle;

/**
 * print Area of a Rectangle
 * Overload the function printArea
 * printArea(2,4);
 * printArea(2,5.1);
 * printArea(10);
 * printArea(2.3);
 */

public class Rectangle_Area {

    //Declaring all the variables as private
    private int IntegerL;
    private float FloatL;
    private int IntegerB;
    private float FloatB;

//Overloading the Constructors

    public Rectangle_Area(int IntegerL, int IntegerB) {
        this.IntegerL = IntegerL;
        this.IntegerB = IntegerB;
    }

    public Rectangle_Area(float FloatL, float FloatB) {
        this.FloatL = FloatL;
        this.FloatB = FloatB;
    }

    public Rectangle_Area(int IntegerL) {
        this.IntegerL = IntegerL;
    }

    public Rectangle_Area(float FloatL) {
        this.FloatL = FloatL;
    }

    public Rectangle_Area() {
    }

    //Setting Getters and Setters for the instance variables
    public int getIntegerL() {
        return IntegerL;
    }

    public void setIntegerL(int integerL) {
        this.IntegerL = integerL;
    }

    public float getFloatL() {
        return FloatL;
    }

    public void setFloatL(float floatL) {
        this.FloatL = floatL;
    }

    public int getIntegerB( ){
        return IntegerB;
    }

    public void setIntegerB(int integerB) {
        if (integerB == 0) {
            this.IntegerB = 1;
        } else {
            this.IntegerB = integerB;
        }
    }

    public float getFloatB() {
        return FloatB;
    }

    public void setFloatB(float floatB) {
        if (floatB == 0) {
            this.FloatB = 1;
        } else {
            this.FloatB = floatB;
        }
    }

    //Method overloading to calculate the Area of the Rectangle
    void calculateArea(int Length, int Breadth) {
        int Result = Length * Breadth;
        System.out.println("Area of the Rectangle is " + Result);
    }

    void calculateArea(float Length, float Breadth) {
        float Result = Length * Breadth;
        System.out.println("Area of the Rectangle is " + Result);
    }

    void calculateArea(int Length){
        int Result = Length * 1;
        System.out.println("Area of the Rectangle is " + Result);
    }

    void calculateArea(float Length){
        float Result = Length * 1;
        System.out.println("Area of the Rectangle is " + Result);
    }



}
