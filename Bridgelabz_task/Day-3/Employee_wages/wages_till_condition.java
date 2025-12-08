package emp_present_or_absent;

public class wages_till_condition {

    public static void main(String[] args) {

        final int IS_FULL_TIME = 1;
        final int IS_PART_TIME = 2;

        int WAGE_PER_HOUR = 20;
        int MAX_HRS_IN_MONTH = 100;     
        int MAX_WORKING_DAYS = 20;      

        int totalEmpHours = 0;          
        int totalWorkingDays = 0;       
        int totalWage = 0;              

        
        while (totalEmpHours < MAX_HRS_IN_MONTH && 
               totalWorkingDays < MAX_WORKING_DAYS) {

            totalWorkingDays++;  

            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            int empHours = 0;

            switch (empCheck) {
                case IS_FULL_TIME:
                    empHours = 8;   
                    break;
                case IS_PART_TIME:
                    empHours = 4;   
                    break;
                default:
                    empHours = 0;   
            }

            // add today's hours to total hours
            totalEmpHours += empHours;

            // calculate today's wage
            int dailyWage = empHours * WAGE_PER_HOUR;
            totalWage += dailyWage;

//            System.out.println("Day: " + totalWorkingDays +
//                    " | Hours: " + empHours +
//                    " | Daily Wage: " + dailyWage +
//                    " | Total Hours: " + totalEmpHours);
        }
        System.out.println("Total Working Days  = " + totalWorkingDays);
        System.out.println("Total Working Hours = " + totalEmpHours);
        System.out.println("Total Monthly Wage  = " + totalWage);
    }
}
