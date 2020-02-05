package Variable_Datatypes;

import java.util.Scanner;
/**
 * Solve (a + b) whole square = a square + b square + 2ab
 * Solve (4a + 5b)2
 *
 * Take the input from command prompt.
 */

public class Problem06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1");
        int Num1 = sc.nextInt();
        System.out.println("Enter num2");
        int Num2 = sc.nextInt();

//Solving (a+b) whole square = a square + b square +2ab
        int Result1 = (int) Math.pow(Num1, 2) + (int) Math.pow(Num2, 2) + (2 * (Num1 * Num2));
        System.out.println("The result for a plus b the whole square is " + Result1 );

//Solving (4a + 5b)2
         int Result2 =((4*Num1) + (5*Num2))*2;
        System.out.println("The result for (4a + 5b)2 is " + Result2);

    }
}
