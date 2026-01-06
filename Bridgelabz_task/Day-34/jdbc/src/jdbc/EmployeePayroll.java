package jdbc;

import java.sql.Date;

class EmployeePayroll {
    int id;
    String name;
    String phoneNumber;
    String address;
    String department;
    String gender;
    double basicPay;
    double deductions;
    double taxablePay;
    double tax;
    double netPay;
    Date start;

    public EmployeePayroll(int id, String name, String phoneNumber, String address,
                           String department, String gender, double basicPay,
                           double deductions, double taxablePay, double tax,
                           double netPay, Date start) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.department = department;
        this.gender = gender;
        this.basicPay = basicPay;
        this.deductions = deductions;
        this.taxablePay = taxablePay;
        this.tax = tax;
        this.netPay = netPay;
        this.start = start;
    }

    @Override
    public String toString() {
        return id + " - " + name + " - " + department + " - " + netPay;
    }
}
