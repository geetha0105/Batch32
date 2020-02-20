package Control_Statement;

import java.util.Scanner;

/**Check if a person can donate blood or not.
 if age>=18
 weight>=50
 "You are eligible to donate blood"
 "You are not eligible to donate blood"
 else
 "Age must be greater than 18"
 */
public class Problem06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age \n");
        int Age = sc.nextInt();
        System.out.println("Enter the Weight \n");
        int Weight = sc.nextInt();

//Checking if the person can donate blood
if (Age >= 18 && Weight >= 50){
    System.out.println("You are eligible to donate blood");
}  else if (Age >= 18 && Weight < 50)  {
    System.out.println("You are not eligible to donate blood");
}else{
    System.out.println("Age must be greater than 18");
}

    }
}
