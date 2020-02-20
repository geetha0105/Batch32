package Self_Learn_Programs;

public class Main_Class_Variable_Arguments {
    public static void main(String[] args) {
        Variable_Arguments Args = new Variable_Arguments();

        //Adding numbers and different sets of arguments are passed
        int Sum1 = Args.Add(2,3,4,5);
        int Sum2 = Args.Add(0);
        System.out.println(Sum1);
        System.out.println(Sum2);

        //Adding numbers of which two numbers are passed as String, so using parse int function to convert them to integers and then add them
        int Sum3 = (Args.Add(2,3,Integer.parseInt("5"), Integer.parseInt("7"), Integer.parseInt("9")));
        System.out.println(Sum3);

        //This method displays the names using Varagrs method
        Args.Display_String("Cat","Mat","Pat");
        Args.Display_String();
    }
}
