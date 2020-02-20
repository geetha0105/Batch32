package Self_Learn_Programs;

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        //Passing the factorial as an argument

        System.out.println(fact(3));
    }
    //Calculating the factorial
       public static int fact(int Number){
            if(Number <= 1){
                return 1;
            }else {
                return Number * (Number-1);
            }
        }
    }

