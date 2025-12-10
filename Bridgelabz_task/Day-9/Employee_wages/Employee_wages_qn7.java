package contact;

public class Employee_wages_qn7 {
	
	private static final int WAGE_PER_HOUR = 20;
	private static final int FULL_DAY_HOUR = 8;
	private static final int PART_TIME_HOUR = 4;
	private static final int WORKING_DAYS_PER_MONTH = 20;
	private static final int MAX_HOURS_IN_MONTH = 100;

	
	public static void computeEmployeeWage() {
		int totalHours = 0;
		int totalDays = 0;
		int totalWage = 0;

		while (totalHours <= MAX_HOURS_IN_MONTH && totalDays < WORKING_DAYS_PER_MONTH) {
			totalDays++;
			int empHours = getEmpHours(); 
			totalHours += empHours;
			int dailyWage = empHours * WAGE_PER_HOUR;
			totalWage += dailyWage;

			System.out.println("Day " + totalDays + ": Hours = " + empHours + ", Daily Wage = " + dailyWage);
		}

		System.out.println("Total Wage for Employee: " + totalWage);
	}

	
	private static int getEmpHours() {
		int empCheck = (int) Math.floor(Math.random() * 3); // 0,1,2
		switch (empCheck) {
		case 1:
			return FULL_DAY_HOUR; 
		case 2:
			return PART_TIME_HOUR;
		default:
			return 0; 
		}
	}

	
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program!");
		computeEmployeeWage(); 
	}
}
