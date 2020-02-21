package Nested_Inner_Classes;

/**The Inner Class will have access to all methods and variables of the enclosing class
The Inner Class can only be created in the context of the Outer Class
However the Enclosing class will not be able to access the members of the inner class
*/
/**This is the Outer class*/
class Nested_Class {
    private static int x;

    /**Constructor for the Nested Class, two constructors are created, one with arguments and other without arguments*/
    public Nested_Class(int x) {
        this.x = x;
    }

    public Nested_Class() {
    }

    /**Method is created in the Outer class to call the inner class method*/
    void Outer_Method() {
        Inner_Class InnerClass = new Inner_Class();
        InnerClass.Inner_Method();
    }

    /**This the inner class*/
    class Inner_Class {
        int x = 1;

        /**Method created inside the inner class*/
        public void Inner_Method() {
            //The outer class object was created to access the outer class X variable
            Nested_Class NC = new Nested_Class();
            x += NC.x;
            System.out.println("The Result is " + " " + x);
        }
    }
}

/**This is the Main Class with the main method which calls the Outer Class*/
public class Driver {
    public static void main(String[] args) {
        Nested_Class NestedClass = new Nested_Class(100);
        //NestedClass.Inner_Class IC = NestedClass.new Inner_Class();
        NestedClass.Outer_Method();
    }

}
