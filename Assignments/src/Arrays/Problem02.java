package Arrays;

import java.util.Scanner;

/**
 A series of numbers in which each number ( Fibonacci number )
 is the sum of the two preceding numbers. The simplest is the
 series 1, 1, 2, 3, 5, 8, etc.
 */

public class Problem02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements to be entered");
        int No_of_Elements = sc.nextInt();
        int Value[] = new int[No_of_Elements];
        int i;
        Value[0] = 0;
        Value[1] = 1;
        for (i = 2; i < No_of_Elements; i++){
            Value[i] = Value[i-1] + Value [i-2];
        }
            for (i = 0; i < No_of_Elements; i++){
                System.out.println(Value[i]);
            }
        }
    }




