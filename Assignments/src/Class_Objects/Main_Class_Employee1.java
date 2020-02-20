package Class_Objects;

public class Main_Class_Employee1 {
    public static void main(String[] args) {

        Employee1 Employee = new Employee1(800, 5);

//Calculating the Additional Salary details by calling respective methods
        float Additional_Sal_1 = Employee.Add_Salary(Employee.Salary);
        float Additional_Sal_2 = Employee.Add_Work(Employee.No_of_Hours_Worked);

//Calculating the Final Salary
        float Final_Salary = Employee.Salary + Additional_Sal_1 + Additional_Sal_2;

//Printing the Final Salary
        System.out.println("The final Salary of the Employee is " + Final_Salary);
    }
}
