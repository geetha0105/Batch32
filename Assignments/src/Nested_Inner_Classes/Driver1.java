package Nested_Inner_Classes;

public class Driver1 {
    public static void main(String[] args) {

     /** Object created to access the Inner class methods */
        Nested_Class.Inner_Class IC = new Nested_Class().new Inner_Class();
        IC.Inner_Method();

      /**Object created to access the Outclass methods */
      Nested_Class NC = new Nested_Class();
      NC.Outer_Method();

    }
}
