package Self_Learn_Programs;

import javax.management.OperationsException;
import java.lang.management.OperatingSystemMXBean;

public class Call_By_Value_Reference {
    static int Number1 = 100;
    public static void main(String[] args) {

 //Call By Value Main method
        System.out.println("Value of Number1 before the Operations1 method is invoked " + Number1);
     Call_By_Value_Reference Call = new Call_By_Value_Reference();
        Call.Operations1(Number1);
        System.out.println("Value of Number1 after the Operations1 Method is invoked " + Number1);


  //Call By Reference Main Method
        System.out.println("Value of Number1 at start" + Number1);
        System.out.println(Call.Operations2(Call));
        System.out.println(Number1 + 1);
    }

//Call By Value
    public void Operations1(int Num){
        System.out.println("Before Addition inside the method " + Num);
        Num++;
        System.out.println("After Addition inside the method " + Num);
    }

//Call By Reference
    public int Operations2(Call_By_Value_Reference Num){
    Num.Number1 = Number1 +100;
    return Number1;
    }
}
