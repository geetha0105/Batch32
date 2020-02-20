package Class_Objects;

import java.util.Scanner;

public class Main_Class_Average {
    public static void main(String[] args) {

        Average Student1_Average = new Average(101,20 );
        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter the students Maths mark");
//        Student1_Average.SetMathsMark(sc.nextInt());
//
//        System.out.println("Enter the students Science mark");
//        Student1_Average.SetScienceMark(sc.nextInt());
//
//        System.out.println("Enter the students Language mark");
//        Student1_Average.SetLanguageMark(sc.nextInt());


        Student1_Average.Calculate_Average();
    }
}
