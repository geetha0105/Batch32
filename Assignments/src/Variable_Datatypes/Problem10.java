package Variable_Datatypes;/* write the program to convert from Celsius to Farenheit
Get the input from the user
 print the out put here.*/

import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter the temperature in degrees centigrade");
        double Celsius = Input.nextDouble();

//Conversion of Celsius to Farenheit
       double Result = (double)((Celsius * 1.8) + 32);
        System.out.println("The temperature in Farenheit is " + Result);



    }
}
