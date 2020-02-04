/*
(Area and perimeter of a rectangle) Displays the area and
perimeter of a rectangle with the width of 6.5 and height of 4.9 using the following
formula:
						area = width * height
						perimeter = (width + height) * 2
NOTE:
	pass width and height as an input to the program.
*/

import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height");
        float height = sc.nextFloat();
        System.out.println("Enter the width");
        float width = sc.nextFloat();

        float area = height * width;
        float perimeter = (height + width) * 2;

        System.out.println("The area of the rectangle is " + area);
        System.out.println("The permineter of the recatangle is " + perimeter);
    }
}
