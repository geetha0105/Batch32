package Control_Statement;
//If Else-If example

import java.util.Scanner;

public class Problem02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a value : \n");
        int input  = scan.nextInt();

        if(input > 100)
            System.out.println("input is greater than 100");
        else if(input > 50)
            System.out.println("input is greater than 50");
        else
            System.out.println("input is less than 50");
    }
}
