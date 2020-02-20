package Control_Statement;

import java.util.Objects;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * take input from command line and determine of the character is a vowel or consonant
 *
 * write the program using if else statement
 * write the program using switch statement also.
 */
public class Problem08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the alphabet \n");
        String Alphabet = sc.nextLine();

//checking for vowel or consonant using Switch case
        switch (Alphabet) {
            case ("a"):
            case ("e"):
            case ("i"):
            case ("o"):
            case ("u"):
                System.out.println("The alphabet is a vowel");
                break;
            default:
                System.out.println("The alphabet is not a vowel");
        }
//checking for vowel or consonant using if else statement
        String[] Letter = {"a" , "e" , "i" , "o" , "u"};

        if (Objects.equals(Alphabet , Letter[0]) ||
            Objects.equals(Alphabet , Letter [1])||
            Objects.equals(Alphabet , Letter[2]) ||
            Objects.equals(Alphabet, Letter[3])  ||
            Objects.equals(Alphabet, Letter[4]))
        {
            System.out.println("The alphabet is a vowel");
        }else
        {
            System.out.println("The alphabet is not a vowel");
        }





        }

    }

