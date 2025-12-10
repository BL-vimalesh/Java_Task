package total;

import java.util.ArrayList;

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

  
//    public int getTotalWage() {
//        return totalWage;
//    }

    @Override
    public String toString() {
        return "Total Employee Wage for Company " + company + " is: " + totalWage;
    }
}


public class Manage_multiplecompany_uc12 {
    public static void main(String[] args) {

        ArrayList<EmpWageBuilder> companies = new ArrayList<>();


        companies.add(new EmpWageBuilder("TCS", 20, 20, 100));
        companies.add(new EmpWageBuilder("Infosys", 25, 22, 120));
        companies.add(new EmpWageBuilder("Wipro", 30, 25, 150));


        for (EmpWageBuilder company : companies) {
            company.computeEmpWage();
            System.out.println(company);
        }
    }
}
