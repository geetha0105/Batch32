package Control_Statement;

import java.util.Scanner;

/**
 * take the month number using command line ,
 * then using the switch statement print the actual Month name.
 * if an invalid month is entered, then print "Invalid number"
 */
public class Problem07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month number");
        int Month_Number = sc.nextInt();

//Printing the Month using Switch case
     switch (Month_Number){
         case (1):
             System.out.println("The month is January");
             break;
         case (2):
             System.out.println("The month is February");
             break;
         case (3):
             System.out.println("The month is March");
             break;
         case (4):
             System.out.println("The month is April");
             break;
         case (5):
             System.out.println("The month is May");
             break;
         case (6):
             System.out.println("The month is June");
             break;
         case (7):
             System.out.println("The month is July");
             break;
         case (8):
             System.out.println("The month is August");
             break;
         case (9):
             System.out.println("The month is September");
             break;
         case (10):
             System.out.println("The month is October");
             break;
         case (11):
             System.out.println("The month is November");
             break;
         case (12):
             System.out.println("The month is December");
             break;
         default:
             System.out.println("Input is invalid");
     }
    }
}
