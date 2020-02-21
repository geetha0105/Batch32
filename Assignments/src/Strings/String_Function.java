package Strings;

import java.util.Locale;

public class String_Function{
    public static void main(String[] args) {

//Concatenation using + sign
        String S1 = "Hello" + "World";
        System.out.println(S1);
//Concatenation using concat method
        String S3 = S1.concat("JAVA");
        System.out.println(S3);

//Substring
        String S2 = "Hello World";
        String S4 = S2.substring(6);
        System.out.println(S4);
        String S5 =  S2.substring(0,5);
        System.out.println(S5);

//UpperCase/LowerCase
        String S6 = "geetha";
        String S7 = S6.toUpperCase(Locale.forLanguageTag(S6));
        System.out.println(S7);
        String S8 = "HELLO";
        String S9 = S8.toLowerCase(Locale.forLanguageTag(S8));

//Trimming spaces
        String S10 = "Travel   ";
        System.out.println(S10.trim());

//Starts and Ends With, it returns boolean value based on the search
        String S11 = "Today is Friday";
        System.out.println(S11.startsWith("T"));
        System.out.println(S11.endsWith("y"));

//CharAt method
        String S12 = "Happy";
        System.out.println(S12.charAt(0));

//String Length
        String S13 = "Good Day";
        System.out.println(S13.length());

//String Value Of -- converting an integer to a String
        int S14 = 10;
        String S15 = String.valueOf(S14);
        System.out.println();

//String Replace
        String S16 = "Monday";
        String S17 = S16.replace("Monday", "Friday");
        System.out.println(S17);

    }
}
