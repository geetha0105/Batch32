package Strings;
/** Different ways of creating Strings */
public class String_Creation_Comparison {
    public static void main(String[] args) {
        String S1 = "JAVA";
        System.out.println(S1);
        char[] S2 = {'L', 'A', 'N', 'G'};
        System.out.println(S2);
        String S3 = new String(S2);
        System.out.println(S3);
        String S4 = new String("Language");
        System.out.println(S4);

/** Comparison of Strings */

        String S5 = "Hello";
        String S6 = "Hello";

//By equals method
        Boolean Result = S5.equals(S6);
        System.out.println(Result);
//By == operator
        if (S5 == S6) {
            System.out.println("true");
        }else{
            System.out.println("false");
        }

//By Compare To Method
 int Result1 = S5.compareTo(S6);
        System.out.println(Result1);
    }
}
