import java.util.Scanner;

/**
 * Add the below bytes and print the  output.
 * hint: you have to use casting to byte.
 */

public class Problem08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num1");
        byte Num1 = sc.nextByte();
        System.out.println("Enter Num2");
        byte Num2 = sc.nextByte();

//Adding the Byte variables
        Byte c = (byte) (Num1 + Num2);
        System.out.println("The result is " + c);


    }

}
