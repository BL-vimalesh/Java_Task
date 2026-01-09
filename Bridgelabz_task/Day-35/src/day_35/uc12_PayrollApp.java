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

public class uc12_PayrollApp {
    private static final String URL = "jdbc:mysql://localhost:3306/payroll_service";
    private static final String USER = "root";
    private static final String PASS = "password";

    static List<EmployeePayroll> employeeList = new ArrayList<>();

    public static void main(String[] args) {
        removeEmployee(1);
        getActiveEmployees();
    }

    static void removeEmployee(int empId) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASS)) {
            String sql = "UPDATE employee_payroll SET is_active=false WHERE id=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, empId);
            int rows = stmt.executeUpdate();

            if (rows == 1) {
                employeeList.removeIf(e -> e.id == empId);
                System.out.println("Employee " + empId + " marked inactive and removed from list.");
            } else {
                System.out.println("Employee not found.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void getActiveEmployees() {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASS)) {
            String sql = "SELECT * FROM employee_payroll WHERE is_active=true";
            ResultSet rs = conn.createStatement().executeQuery(sql);
            System.out.println("Active Employees:");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " | " + rs.getString("name") + " | Salary: " + rs.getDouble("salary"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
