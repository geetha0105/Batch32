package Control_Statement;

import java.util.Scanner;

/**
 * take input from command line and determine of the character is a small letter or capital letter
 *
 * write the program using if else statement
 */
public class Problem09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the alphabet \n");
        char Alphabet = sc.next().charAt(0);
        int ascii_value = Alphabet;

//To check if the input is a capital or small letter
         if (ascii_value >= 65 & ascii_value <=90){
             System.out.println("The Alphabet is a CAPITAL LETTER");
         }else {
             System.out.println("The ALPHABET is a SMALL LETTER");

    }
    }

}
