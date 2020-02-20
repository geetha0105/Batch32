package Class_Objects;

public class Static_Methods {
    public static void main(String[] args) {

        /*The static methods could be called without creating an object or an instance for it.
        This is because static methods are on the class itself. */
        Static_Methods.Method2();

        //The non static methods can be called only by creating an object or instance for it
         Static_Methods Static_Method = new Static_Methods();
         Static_Method.Method1();

         /*The static method is also called directly without creating an object in the Main_Class_Calculator file.
        Refer to it to verify how it works */
    }

    //Non Static Method
    public void  Method1(){
        System.out.println("This is a non static method");
    }

    //Static Method
    public static void Method2(){
        System.out.println("This is a static method");
    }


}


