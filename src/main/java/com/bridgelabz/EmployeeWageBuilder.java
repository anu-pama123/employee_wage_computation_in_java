package com.bridgelabz;
public class EmployeeWageBuilder {
    public static void main(String[] arg) {
        final int IS_FULL_TIME=1;
        final int IS_PART_TIME=2;
        final int WAGE_PER_HOUR=20;
        final int FULL_DAY_HOUR=8;
        final int PART_TIME_HOUR=4;
        double Employee_Check=Math.floor((Math.random() * 10)) % 3;
        if (Employee_Check == IS_FULL_TIME)
        {
            System.out.println("Employee is full time present");
            double Daily_Employee_Wage=(WAGE_PER_HOUR * FULL_DAY_HOUR);
            System.out.println("Daily employee wage is = " + Daily_Employee_Wage);
        }
        else if (Employee_Check == IS_PART_TIME)
        {
            System.out.println("Employee is Part time present");
            double Daily_Employee_Wage=(WAGE_PER_HOUR * PART_TIME_HOUR);
            System.out.println("Daily employee wage is = " + Daily_Employee_Wage);
        }
        else {
            System.out.println(" Employee is absent ");
        }
    }
}
