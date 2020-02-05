package Variable_Datatypes;

import java.util.Scanner;

/**
 * Take two numbers, assign it to two different variables.
 * SUM both the variables and store it to the variable in line 10;
 * Display the output.
 */

public class Problem07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num1");
        int Num1 = sc.nextInt();
        System.out.println("Enter Num2");
        int Num2 = sc.nextInt();

//Adding two numbers
        System.out.println("The sum of two Numbers is " + (Num1+Num2));
    }
}
