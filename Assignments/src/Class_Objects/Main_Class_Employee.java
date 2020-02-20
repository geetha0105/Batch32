package Class_Objects;

public class Main_Class_Employee {

    public static void main(String[] args) {

        Employee E1 = new Employee();
        E1.Name = "Tom";
        E1.Year_of_Joining = 1983;
        E1.Address = "44- McDonald Street";

        Employee E2 = new Employee();
        E2.Name = "Sam";
        E2.Year_of_Joining = 2000;
        E2.Address = "55- McDonald Street";

        Employee E3 = new Employee();
        E3.Name = "Smith";
        E3.Year_of_Joining = 2000;
        E3.Address = "88- McDonald Street";
        System.out.printf("%s%20s%15s%n" , "Name", "Year_of_Joining", "Address");
        System.out.printf("%s %10d %35s%n" , E1.Name, E1.Year_of_Joining, E1.Address);
        System.out.printf("%s %10d %35s%n" , E2.Name, E2.Year_of_Joining, E2.Address);
        System.out.printf("%s %10d %35s%n" , E3.Name, E3.Year_of_Joining, E3.Address);





    }
}
