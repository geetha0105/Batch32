package Class_Objects;

public class Calculator {

     /*    When we create a variable as a static variable, these variables can be accessed by the main methods
directly without the need to  create any new object for the class. These variables are called as static
 variables or class variables*/
   static float pi = 3.14f;

   //Method Overloading
    public int Add(int a, int b){
        int Result;
        Result = a + b;
        return Result;
       // System.out.println("The Addition of two numbers is" + " " + Result );
    }

    public int Add(int a, int b, int c){
        int Result;
        Result = a + b + c;
        return Result;
    }

    public int Add(int a, int b, int c, int d){
        int Result;
        Result = a + b + c + d;
        return Result;
    }

    public int Subtract(int a, int b){
        int Result;
        Result = a - b;
        return Result;
       // System.out.println("The Subtraction of two numbers is" + " " + Result);

    }


}
