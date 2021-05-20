package com.bridgelabz;
    public class EmployeeWageBuilder {
        public static final int IS_FULL_TIME = 1;
        public static final int IS_PART_TIME = 2;
        public static final int WAGE_PER_HOUR= 20;
    public static void main(String[] arg) {
        int total_salary = 0;
        int employee_hrs=0;
        for (int day = 1; day <= 20; day++) {
            int employee_check = (int) (Math.floor((Math.random() * 10)) % 3);
            switch (employee_check) {
                case IS_FULL_TIME :
                    employee_hrs = 8;
                    break;
                case IS_PART_TIME :
                    employee_hrs = 4;
                    break;
                default:
                      employee_hrs = 0;
                      break;
            }
            total_salary = total_salary + (employee_hrs * WAGE_PER_HOUR);

        }

        System.out.println("Wages for a month = " + total_salary);
    }
            }

