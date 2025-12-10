package total;


interface IComputeEmpWage {
 void addCompanyEmpWage(String company, int wagePerHour, int maxWorkingDays, int maxHoursPerMonth);
 void computeEmpWage();
}


class CompanyEmpWage {
 public final String company;
 public final int wagePerHour;
 public final int maxWorkingDays;
 public final int maxHoursPerMonth;
 public int totalWage;

 public CompanyEmpWage(String company, int wagePerHour, int maxWorkingDays, int maxHoursPerMonth) {
     this.company = company;
     this.wagePerHour = wagePerHour;
     this.maxWorkingDays = maxWorkingDays;
     this.maxHoursPerMonth = maxHoursPerMonth;
 }

 @Override
 public String toString() {
     return "Total Employee Wage for Company " + company + " is: " + totalWage;
 }
}


class EmpWageBuilder implements IComputeEmpWage {
 private CompanyEmpWage[] companyEmpWages;
 private int numOfCompanies;

 public EmpWageBuilder(int n) {
     companyEmpWages = new CompanyEmpWage[n];
 }

 @Override
 public void addCompanyEmpWage(String company, int wagePerHour, int maxWorkingDays, int maxHoursPerMonth) {
     companyEmpWages[numOfCompanies++] = new CompanyEmpWage(company, wagePerHour, maxWorkingDays, maxHoursPerMonth);
 }

 @Override
 public void computeEmpWage() {
     for (int i = 0; i < numOfCompanies; i++) {
         companyEmpWages[i].totalWage = this.computeEmpWage(companyEmpWages[i]);
         System.out.println(companyEmpWages[i]);
     }
 }

 private int computeEmpWage(CompanyEmpWage companyEmpWage) {
     int totalHours = 0;
     int totalDays = 0;

     while (totalHours < companyEmpWage.maxHoursPerMonth && totalDays < companyEmpWage.maxWorkingDays) {
         totalDays++;
         int empHours = getWorkingHours();
         totalHours += empHours;
     }

     return totalHours * companyEmpWage.wagePerHour;
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


public class interface_approach_cu11 {
 public static void main(String[] args) {
     EmpWageBuilder empWageBuilder = new EmpWageBuilder(3);

     empWageBuilder.addCompanyEmpWage("TCS", 20, 20, 100);
     empWageBuilder.addCompanyEmpWage("Infosys", 25, 22, 120);
     empWageBuilder.addCompanyEmpWage("Wipro", 30, 25, 150);

     empWageBuilder.computeEmpWage();
 }
}
