package Control_Statement;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

/**
 Find if the number is odd or even
 Take input from command line
 use if condition to check if its odd, then print, "The Number is odd <number>"
 else "The Number is even<number>"
 */
public class Problem03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: \n");
        int Input = sc.nextInt();

//To check if the number is odd or even

if (Input % 2 == 0){
    System.out.println("The Number is even " + (Input));
}        else {
    System.out.println("The Number is odd " + (Input));
}
    }

}
