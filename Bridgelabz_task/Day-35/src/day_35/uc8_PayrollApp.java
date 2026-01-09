package day_35;

import java.sql.*;
import java.util.*;

class EmployeePayroll {
    int id;
    String name;
    double salary;

    EmployeePayroll(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}

public class uc8_PayrollApp {
    static List<EmployeePayroll> employeeList = new ArrayList<>();

    public static void main(String[] args) {
        EmployeePayroll emp = new EmployeePayroll(1, "Vimalesh", 50000);

        if (addEmployee(emp)) {
            employeeList.add(emp);
            System.out.println("Employee added successfully to DB and List!");
        } else {
            System.out.println("Failed to add employee.");
        }
    }

    static boolean addEmployee(EmployeePayroll emp) {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/payroll_service", "root", "password");
            conn.setAutoCommit(false); 

            String sql1 = "INSERT INTO employee_payroll (id, name, salary) VALUES (?, ?, ?)";
            PreparedStatement stmt1 = conn.prepareStatement(sql1);
            stmt1.setInt(1, emp.id);
            stmt1.setString(2, emp.name);
            stmt1.setDouble(3, emp.salary);
            int rows1 = stmt1.executeUpdate();

            double deduction = 0.2 * emp.salary;
            double taxablePay = emp.salary - deduction;
            double tax = 0.1 * taxablePay;
            double netPay = emp.salary - tax;

            String sql2 = "INSERT INTO payroll_details (emp_id, deduction, taxable_pay, tax, net_pay) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement stmt2 = conn.prepareStatement(sql2);
            stmt2.setInt(1, emp.id);
            stmt2.setDouble(2, deduction);
            stmt2.setDouble(3, taxablePay);
            stmt2.setDouble(4, tax);
            stmt2.setDouble(5, netPay);
            int rows2 = stmt2.executeUpdate();

            if (rows1 == 1 && rows2 == 1) {
                conn.commit();
                return true;
            } else {
                conn.rollback();
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            try { if (conn != null) conn.rollback(); } catch (Exception ex) {}
            return false;
        } finally {
            try { if (conn != null) conn.close(); } catch (Exception e) {}
        }
    }
}

