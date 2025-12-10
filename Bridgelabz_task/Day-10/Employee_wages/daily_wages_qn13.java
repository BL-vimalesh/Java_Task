package total;
import java.util.ArrayList;

class CompanyEmpWage {
    public final String company;
    public final int wagePerHour;
    public final int maxWorkingDays;
    public final int maxHoursPerMonth;
    public int totalWage;
    public ArrayList<Integer> dailyWages; 

    public CompanyEmpWage(String company, int wagePerHour, int maxWorkingDays, int maxHoursPerMonth) {
        this.company = company;
        this.wagePerHour = wagePerHour;
        this.maxWorkingDays = maxWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
        this.dailyWages = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Company: " + company + "\nDaily Wages: " + dailyWages + "\nTotal Wage: " + totalWage;
    }
}

class EmpWageBuilder {
    private ArrayList<CompanyEmpWage> companies;

    public EmpWageBuilder() {
        companies = new ArrayList<>();
    }

    public void addCompanyEmpWage(String company, int wagePerHour, int maxWorkingDays, int maxHoursPerMonth) {
        companies.add(new CompanyEmpWage(company, wagePerHour, maxWorkingDays, maxHoursPerMonth));
    }

    public void computeEmpWage() {
        for (CompanyEmpWage company : companies) {
            company.totalWage = computeEmpWage(company);
            System.out.println(company);
        }
    }

    private int computeEmpWage(CompanyEmpWage company) {
        int totalHours = 0;
        int totalDays = 0;

        while (totalHours < company.maxHoursPerMonth && totalDays < company.maxWorkingDays) {
            totalDays++;
            int empHours = getWorkingHours();
            int dailyWage = empHours * company.wagePerHour;
            company.dailyWages.add(dailyWage); 
            totalHours += empHours;
        }

        
        int total = 0;
        for (int wage : company.dailyWages) {
            total += wage;
        }
        return total;
    }

    private int getWorkingHours() {
        int empCheck = (int) Math.floor(Math.random() * 3);
        switch (empCheck) {
            case 1: return 8; 
            case 2: return 4; 
            default: return 0;
        }
    }
}

public class daily_wages_qn13 {
    public static void main(String[] args) {
        EmpWageBuilder empWageBuilder = new EmpWageBuilder();

        empWageBuilder.addCompanyEmpWage("TCS", 20, 20, 100);
        empWageBuilder.addCompanyEmpWage("Infosys", 25, 22, 120);
        empWageBuilder.addCompanyEmpWage("Wipro", 30, 25, 150);

        empWageBuilder.computeEmpWage();
    }
}

