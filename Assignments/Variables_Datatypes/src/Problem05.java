/*
(Area and perimeter of a rectangle) Displays the area and
perimeter of a rectangle with the width of 6.5 and height of 4.9 using the following
formula:
						area = width * height
						perimeter = (width + height) * 2
NOTE:
	pass width and height as an input to the program.
*/

public class Problem05 {
    public static void main(String[] args) {
        float height = 4.9f;
        float width = 6.4f;
        float area = height * width;
        float perimeter = (height + width) * 2;
        System.out.println("The area of the rectangle is " + area);
        System.out.println("The permineter of the recatangle is " + perimeter);
    }
}
