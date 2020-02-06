package Operators;

import java.util.Scanner;

//if a_distance > b_distance and c_distance > 20. Then print as condition satisfied
public class Problem07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a_distance");
        int a_distance = sc.nextInt();
        System.out.println("Enter b_distance");
        int b_distance = sc.nextInt();
        System.out.println("Enter c_distance");
        int c_distance = sc.nextInt();

        boolean  result1 = (a_distance > b_distance) && (c_distance >20);
        System.out.println(result1 == true? "Condition satisfied" : "Condition not satisfied");
    }




}
