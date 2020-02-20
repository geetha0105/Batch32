package Class_Objects;

import org.w3c.dom.css.Rect;

import java.awt.geom.Rectangle2D;

public class Main_Class_RectangleArea {
    public static void main(String[] args) {
        Rectangle Rect1 = new Rectangle(4,6);
        Rectangle Rect2 = new Rectangle(5,8);


        int Area_Rect1 = Rect1.Calculate_Area();
        int Area_Rect2 = Rect2.Calculate_Area();

//Area of Rect1
        System.out.println("Area of Rect1");
        System.out.println("The Length of Rect1 is " + Rect1.length);
        System.out.println("The Length of Rect2 is " + Rect1.breadth);
        System.out.println("Area of Rect1 is " + Area_Rect1);

        System.out.println("*************************************");

//Area of Rect2
        System.out.println("Area of Rect2");
        System.out.println("The Length of Rect2 is " + Rect2.length);
        System.out.println("The Length of Rect2 is " + Rect2.breadth);
        System.out.println("Area of Rect1 is " + Area_Rect2);



    }
}
