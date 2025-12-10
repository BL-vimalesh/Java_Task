package contact;

public class Employee_with_multiple_companies {

	
	public static void computeEmployeeWage(String company, int wagePerHour, int workingDays, int maxHoursPerMonth) {
		int totalHours = 0;
		int totalDays = 0;
		int totalWage = 0;

		
		while (totalHours <= maxHoursPerMonth && totalDays < workingDays) {
			totalDays++;
			int empHours = getEmpHours();
			totalHours += empHours;
			int dailyWage = empHours * wagePerHour;
			totalWage += dailyWage;

			System.out.println(company + " - Day " + totalDays + ": Hours = " + empHours + ", Daily Wage = " + dailyWage);
		}

		System.out.println("Total Wage for " + company + " employee: " + totalWage);
	}

	
	private static int getEmpHours() {
		int empCheck = (int) Math.floor(Math.random() * 3); // 0,1,2
		switch (empCheck) {
		case 1:
			return 8; 
		case 2:
			return 4; 
		default:
			return 0; 
		}
	}
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program!");

		
		computeEmployeeWage("TCS", 20, 20, 100);
		computeEmployeeWage("Infosys", 25, 22, 120);
		computeEmployeeWage("Wipro", 30, 18, 90);
	}
}
