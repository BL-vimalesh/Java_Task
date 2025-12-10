package total;

class EmpWageBuilder {
    
    private String company;
    private int wagePerHour;
    private int maxWorkingDays;
    private int maxHoursPerMonth;
    
    private int totalWage;

    public EmpWageBuilder(String company, int wagePerHour, int maxWorkingDays, int maxHoursPerMonth) {
        this.company = company;
        this.wagePerHour = wagePerHour;
        this.maxWorkingDays = maxWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }

    public void computeEmpWage() {
        int totalHours = 0;
        int totalDays = 0;

        while (totalHours < maxHoursPerMonth && totalDays < maxWorkingDays) {
            totalDays++;
            int empHours = getWorkingHours(); 
            totalHours += empHours;
        }

        totalWage = totalHours * wagePerHour;
    }

    private int getWorkingHours() {
        int empCheck = (int) Math.floor(Math.random() * 3); 
        switch (empCheck) {
            case 1: return 8; 
            case 2: return 4; 
            default: return 0;
        }
    }

    @Override
    public String toString() {
        return "Total Employee Wage for Company " + company + " is: " + totalWage;
    }
}


public class total_wages_qn9 {
    public static void main(String[] args) {

        
        EmpWageBuilder[] companies = new EmpWageBuilder[3];

        
        companies[0] = new EmpWageBuilder("TCS", 20, 20, 100);
        companies[1] = new EmpWageBuilder("Infosys", 25, 22, 120);
        companies[2] = new EmpWageBuilder("Wipro", 30, 25, 150);

        
        for (int i = 0; i < companies.length; i++) {
            companies[i].computeEmpWage();
            System.out.println(companies[i]);
        }
    }
}
