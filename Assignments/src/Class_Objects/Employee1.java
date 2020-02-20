package Class_Objects;
/**
        * Write a program by creating an 'Employee' class having the following methods and print the final salary.
        * 1 - 'getInfo()' which takes the salary, number of hours of work per day of employee as parameter
        * 2 - 'AddSal()' which adds $10 to salary of the employee if it is less than $500.
        * 3 - 'AddWork()' which adds $5 to salary of employee if the number of hours of work per day is more than 6 hours.
        */
public class Employee1 {
    float Salary;
    float No_of_Hours_Worked;
    float Additional_Sal1;
    float Additional_Sal2;

//Constructor for Employee1
    Employee1(float S, float NHW) {
        Salary = S;
        No_of_Hours_Worked = NHW;
    }

//Method to 10$ to salary if the Salary is < 500
    float Add_Salary(float S) {
        if (Salary < 500) {
            Additional_Sal1 = 10;
        }else{
            Additional_Sal1 = 0;
        }
        return Additional_Sal1;
    }

//Method to Add 5$ to salary if No of Hours worked is >6
    float Add_Work(float NHW) {
        if (No_of_Hours_Worked > 6) {
            Additional_Sal2 = 5;
        }else{
            Additional_Sal2 = 0;
        }
        return Additional_Sal2;
    }
}