import javax.swing.*;
import java.util.Scanner;

/**
 * Use scanner to take input dynamically.
 * To check if a given number is odd or even using module operator
 * The inputs should be taken dynamically using scanner
 */

public class Problem09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int Number = sc.nextInt();

//Checking if the provided number is odd or even
        int Result = Number % 2;
        if (Result == 1) {
            System.out.println("The number is odd" + "" + Number);
        } else {
            System.out.println("The number is even" + "" + Number);
        }
    }
}
