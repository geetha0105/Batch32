package Arrays;
import java.util.Scanner;

/**
 Find the Average Value of the numbers array
 Eg : Avg value of 3,4,5,6,7 is equals (3+4+5+6+7)/5
 */

public class Problem01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int No_of_elements = sc.nextInt();
        int Values[] = new int[No_of_elements];
        int i; int Sum = 0;

//Calculating the Sum and Average
        for (i = 0; i < No_of_elements; i++ ){
            System.out.println("Enter the " + i + " " + "element");
            Values[i] = sc.nextInt();
            Sum = Sum + Values[i];
        }
            int Average = Sum / (Values.length);

//Printing the Sum and Average
        System.out.println("The Sum is " + Sum);
        System.out.println("The Average is " + Average);
    }
}
