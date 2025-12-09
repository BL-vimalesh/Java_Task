package day_8;

import java.util.Random;

public class Employee_wages_problem {
    static final int FULL_TIME = 1;
    static final int PART_TIME = 2;
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;
    static final int PART_TIME_HOUR = 4;
    static final int WORKING_DAYS_PER_MONTH = 20;
    static final int MAX_HOURS_IN_MONTH = 100;
    static final int MAX_WORKING_DAYS = 20;

    public static boolean isPresent() {
        Random rand = new Random();
        int attendance = rand.nextInt(2); 
        return attendance == 1;
    }

    
    public static int calculateDailyWage(int hours) {
        return hours * WAGE_PER_HOUR;
    }

    
    public static int getEmpHours() {
        Random rand = new Random();
        int empCheck = rand.nextInt(3); 
        switch(empCheck) {
            case FULL_TIME: return FULL_DAY_HOUR;
            case PART_TIME: return PART_TIME_HOUR;
            default: return 0; 
        }
    }

    public static int calculateMonthlyWage() {
        int totalWage = 0;
        for(int day=1; day<=WORKING_DAYS_PER_MONTH; day++) {
            int hours = getEmpHours();
            totalWage += calculateDailyWage(hours);
        }
        return totalWage;
    }

    
    public static int calculateConditionalWage() {
        int totalHours = 0, totalDays = 0, totalWage = 0;
        while(totalHours <= MAX_HOURS_IN_MONTH && totalDays < MAX_WORKING_DAYS) {
            totalDays++;
            int hours = getEmpHours();
            totalHours += hours;
            totalWage += calculateDailyWage(hours);
        }
        return totalWage;
    }

    
    public static void computeEmployeeWage() {
        System.out.println("Employee Present? " + isPresent());
        System.out.println("Daily Wage Example: " + calculateDailyWage(getEmpHours()));
        System.out.println("Monthly Wage (20 days): " + calculateMonthlyWage());
        System.out.println("Conditional Wage (<=100 hrs, <=20 days): " + calculateConditionalWage());
    }

    
    public static void main(String[] args) {
        computeEmployeeWage();
    }
}

