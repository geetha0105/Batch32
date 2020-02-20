package Control_Statement;

import java.util.Scanner;

/**
 * Check +ve , -ve or ZERO
 *  number>0 --> +ve
 *  number<0 --> -ve
 *  else print number is ZERO
 */
public class Problem05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number \n");
        int Input = sc.nextInt();

//checking if the number is + or -
//need to add check to see whether the given input is an integer or not

        if (Input > 0) {
            System.out.println("The number is positive");
        } else if (Input < 0) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is Zero");
        }

    }
}

