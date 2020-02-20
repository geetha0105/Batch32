package Class_Objects;

public class Main_Class_Calculator {
    public static void main(String[] args) {

        //static variable defined in the Calculator class is called without creation of object
        float pi_value = Calculator.pi;

        /* The static method called Method1 was created in Static Methods class file and i will be able to call
   the method without creating any object or instance for the static method
    */
        Static_Methods.Method2();

        Calculator calc = new Calculator();
        int a = 100;
        int b = 50;
        int c = 500;
        int d = 700;
        calc.Add(a , b);
        calc.Subtract(a, b); //this is called passing by value

        //logic being done is c - (a+b)
        int Result = calc.Subtract(c, (calc.Add(a, b)));
        System.out.println("The Result is " + " " + Result);

        //Next logic is d + above Result
        int Result1 = calc.Add(d,Result);
        System.out.println("The Result1 is " + " " + Result1);

        //Adding giving 4 arguments
        System.out.println("The Addition of 4 numbers is " + calc.Add(a,b,c,d));
    }
}
