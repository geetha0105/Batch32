package Constructor_Methods;

import Class_Objects.Rectangle;

public class Main_Class_Rectangle_Area {
    public static void main(String[] args) {

//Calculating the Area of the Triangle with Length as 2 and Breadth as 4
        Rectangle_Area RectArea1 = new Rectangle_Area(2, 4);
        RectArea1.calculateArea(RectArea1.getIntegerL(), RectArea1.getIntegerB());

//Calculating the Area of the Triangle with length as 2f and Breadth as 5.1f
        Rectangle_Area RectArea2 = new Rectangle_Area();
        RectArea1.calculateArea(2f,5.1f);

/*Calculating the Area of the Triangle with length as 10 and Breadth not given, if breadth is not given assume
        breadth as 1 and calculate the area */
        Rectangle_Area RectArea3 = new Rectangle_Area();
        RectArea3.setIntegerL(10);
        //RectArea3.setIntegerB(0); -- when iam trying to set a default value for Breadth when it is not given using set method
        RectArea3.calculateArea(RectArea3.getIntegerL());

/*Calculating the Area of the Triangle with length as 2.3f and Breadth not given, if breadth is not given assume
        breadth as 1 and calculate the area */
        Rectangle_Area RectArea4 = new Rectangle_Area();
        RectArea4.setFloatL(2.3f);
        //RectArea4.setFloatB(0); ---- when iam trying to set a default value for Breadth when it is not given using set method
        RectArea4.calculateArea(RectArea4.getFloatL());
    }
}
