package com.bridgelabz;
public class EmployeeWageBuilder {
    public static void main(String[] arg) {
        int IS_PRESENT=1;
        double Employee_Check=Math.floor((Math.random() * 10)) % 2;
        if (Employee_Check == IS_PRESENT)
        {
            System.out.println("Employee is present");
        }
        else
        {
            System.out.println("Employee is absent");
        }
    }
}
