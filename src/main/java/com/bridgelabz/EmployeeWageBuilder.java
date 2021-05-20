package com.bridgelabz;
    public class EmployeeWageBuilder {
        public static final int IS_FULL_TIME = 1;
        public static final int IS_PART_TIME = 2;
        public static final int WAGE_PER_HOUR= 20;
        public static final int MAX_HOURS_IN_MONTH= 10;
        public static final int NO_OF_WORKING_DAYS= 20;
    public static void main(String[] arg) {
        int total_salary = 0;
        int employee_hrs=0;
        int total_working_days=0;
        while (total_working_days<=NO_OF_WORKING_DAYS  && employee_hrs<=MAX_HOURS_IN_MONTH) {
            int employee_check = (int) (Math.floor((Math.random() * 10)) % 3);
            total_working_days++;
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

