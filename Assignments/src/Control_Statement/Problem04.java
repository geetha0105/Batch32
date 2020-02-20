package Control_Statement;

import java.util.Scanner;

/**
 * Determine the grade of the student based on the mark

 marks<50 --> Fail
 marks>=50 && marks<60 --> D Grade
 marks>=60 && marks<70 --> C Grade
 marks>=70 && marks<80 --> B Grade
 marks>=80 && marks<90 --> A Grade
 marks>=90 && marks<=100 --> A+ Grade
 if the number does not fall between 0 to 100 , it should print invalid.
 */
public class Problem04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the score of the student \n");
        int Score = sc.nextInt();

//Checking the grade using nested if
        if (Score < 50) {
            System.out.println(" FAIL ");
        }
        if (Score >= 50 && Score < 60) {
            System.out.println(" D GRADE ");
        }
        if (Score >= 60 && Score < 70) {
            System.out.println(" C GRADE ");
        }
        if (Score >= 70 && Score < 80) {
            System.out.println(" B GRADE ");
        }
        if (Score >= 80 && Score < 90) {
            System.out.println(" A GRADE ");
        }
        if (Score >= 90 && Score <= 100) {
            System.out.println("A+ GRADE");
        }
        if (Score > 100) {
            System.out.println("Score is invalid");
        }

//Checking the grade using if else
        if (Score < 50) {
            System.out.println(" FAIL ");
        } else if (Score >= 50 && Score < 60) {
            System.out.println(" D GRADE ");
        } else if (Score >= 60 && Score < 70) {
            System.out.println(" C GRADE ");
        } else if (Score >= 70 && Score < 80) {
            System.out.println(" B GRADE ");
        } else if (Score >= 80 && Score < 90) {
            System.out.println(" A GRADE ");
        } else if (Score >= 90 && Score <= 100) {
            System.out.println("A+ GRADE");
        } else {
            System.out.println("Score is invalid");
        }
    }
}

