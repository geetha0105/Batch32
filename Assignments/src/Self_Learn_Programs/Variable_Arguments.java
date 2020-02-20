package Self_Learn_Programs;

public class Variable_Arguments {

    public int Add(int ... varg) {
        int Sum = 0;
        if (varg.length == 0)
            return 0;
        for (int val : varg){
            Sum += val;
        }
        return Sum;
    }

    public void Display_String(String ... name){
        if (name.length == 0)
            System.out.println("No names provided");

        for (String temp : name){
            System.out.println(temp);
        }
    }
}
