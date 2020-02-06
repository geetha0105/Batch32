package Operators;
// check if a > b or b < c . If this condition is true, then print success. you can use ternary operator or if else condition
public class Problem05 {
    public static void main(String[] args) {
        int a=10;
        int b=5;
        int c=20;

//Checking the conditions using ternary operator
        String Result = (a > b)  ? "Success" : (b < c) ? "Success": "Fail";
        System.out.println(Result);

//Checking the condition using if else condition
        if (a>b) {
            System.out.println("Success");
        }else if (b<c){
            System.out.println("Success");
        }else{
            System.out.println("Fail");
        }

    }
}
