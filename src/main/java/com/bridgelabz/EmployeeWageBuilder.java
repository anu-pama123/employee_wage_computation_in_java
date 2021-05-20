package com.bridgelabz;
    import java.util.Random;
    public class EmployeeWageBuilder {
    public static void main(String[] arg) {
        int WAGE_PER_HOUR=20;
        int PART_TIME_HOUR=4;
        int FULL_TIME_HOUR=8;
        double Daily_Part_Time_Employee_Wage=(WAGE_PER_HOUR * PART_TIME_HOUR);
        double Daily_full_Time_Employee_Wage=(WAGE_PER_HOUR * FULL_TIME_HOUR);
        Random random = new Random();
        int full_time_or_part_time;
        full_time_or_part_time = random.nextInt(3);
        switch (full_time_or_part_time)
        {
            case(0) :
                System.out.println("Daily full time employee wage is = ");
                System.out.println(Daily_full_Time_Employee_Wage);
                break;
            case (1) :
                System.out.println("Daily part time employee wage is = ");
                System.out.println(Daily_Part_Time_Employee_Wage);
                break;
            case(2) :
                System.out.println("Employee is absent");
                break;
        }

    }
            }

