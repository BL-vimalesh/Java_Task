package day_35;

import java.sql.*;
import java.util.*;

class EmployeePayroll {
    int id;
    String name;
    double salary;
    String gender;
    String startDate;
    List<String> departments;

    EmployeePayroll(int id, String name, double salary, String gender, String startDate, List<String> departments) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.gender = gender;
        this.startDate = startDate;
        this.departments = departments;
    }
}

public class uc9_PayrollApp {
    public static void main(String[] args) {
        EmployeePayroll emp = new EmployeePayroll(
            1, "Vimalesh", 50000, "M", "2026-01-09",
            Arrays.asList("HR", "Finance")
        );

        if (addEmployee(emp)) {
            System.out.println("Employee added successfully!");
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

            String sql1 = "INSERT INTO employee_payroll (id, name, salary, gender, start_date) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement stmt1 = conn.prepareStatement(sql1);
            stmt1.setInt(1, emp.id);
            stmt1.setString(2, emp.name);
            stmt1.setDouble(3, emp.salary);
            stmt1.setString(4, emp.gender);
            stmt1.setString(5, emp.startDate);
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

            int deptRows = 0;
            for (String deptName : emp.departments) {
                String sqlDept = "INSERT INTO department (dept_name) VALUES (?) ON DUPLICATE KEY UPDATE dept_name=dept_name";
                PreparedStatement stmtDept = conn.prepareStatement(sqlDept, Statement.RETURN_GENERATED_KEYS);
                stmtDept.setString(1, deptName);
                stmtDept.executeUpdate();

                int deptId;
                ResultSet rs = stmtDept.getGeneratedKeys();
                if (rs.next()) {
                    deptId = rs.getInt(1);
                } else {
                    PreparedStatement stmtGet = conn.prepareStatement("SELECT dept_id FROM department WHERE dept_name=?");
                    stmtGet.setString(1, deptName);
                    ResultSet rs2 = stmtGet.executeQuery();
                    rs2.next();
                    deptId = rs2.getInt("dept_id");
                }

                String sqlEmpDept = "INSERT INTO employee_department (emp_id, dept_id) VALUES (?, ?)";
                PreparedStatement stmtEmpDept = conn.prepareStatement(sqlEmpDept);
                stmtEmpDept.setInt(1, emp.id);
                stmtEmpDept.setInt(2, deptId);
                deptRows += stmtEmpDept.executeUpdate();
            }

            if (rows1 == 1 && rows2 == 1 && deptRows == emp.departments.size()) {
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

