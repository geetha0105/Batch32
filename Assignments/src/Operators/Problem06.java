package Operators;

import java.util.Scanner;

/**
 * Using ternary Operator check which number is maximum and print it.
 */
public class Problem06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num1");
        int Num1 = sc.nextInt();
        System.out.println("Enter Num2");
        int Num2 = sc.nextInt();

//Checking the maximum and minimum of two numbers
        int max_value = (Num1>Num2)? Num1 : Num2;
        System.out.println("Max of both number is " + max_value);

        int min_value = (Num1<Num2)? Num1 : Num2;
        System.out.println("Min of both number is " + min_value);


    }
}
