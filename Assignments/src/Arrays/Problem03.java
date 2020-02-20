package Arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 A palindrome is a word, phrase, number, or other sequence of characters which reads the
 same backward or forward, such as madam or kayak.
 https://en.wikipedia.org/wiki/Palindrome
 */

public class Problem03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        String Word = sc.nextLine();
        String[] Letters = new String[Word.length()];

//Getting the string into an array Letter[i] and getting the same string in another array New_Letter[i] in the reverse order
        String[] New_Letters = new String[Word.length()];
        for (int i = 0; i < Word.length(); i++) {
            Letters[i] = String.valueOf(Word.charAt(i));
            New_Letters[i] = String.valueOf(Word.charAt((Word.length() - 1) - i));

//Comparing both the arrays equality
            if (Arrays.equals(Letters, New_Letters)) {
                System.out.println("The word is a palindrome");
            } else {
                System.out.println("The word is not a palindrome");
            }


        }


    }
}