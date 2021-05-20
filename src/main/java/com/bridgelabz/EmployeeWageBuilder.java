package com.bridgelabz;
public class EmployeeWageBuilder {
    public static void main(String[] arg) {
        final int IS_PRESENT=1;
        final int WAGE_PER_HOUR=20;
        final int FULL_DAY_HOUR=8;
        double Employee_Check=Math.floor((Math.random() * 10)) % 2;
        if (Employee_Check == IS_PRESENT)
        {
            System.out.println("Employee is present");
            double Daily_Employee_Wage=(WAGE_PER_HOUR * FULL_DAY_HOUR);
            System.out.println("Daily employee wage is = " + Daily_Employee_Wage);
        }
        else
        {
            System.out.println("Employee is absent");
        }
    }
}
