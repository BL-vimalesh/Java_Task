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

public class uc7_PayrollApp {
    static List<EmployeePayroll> employeeList = new ArrayList<>();

    public static void main(String[] args) {
        EmployeePayroll emp = new EmployeePayroll(1, "Vimalesh", 50000);

        if (addEmployeeToDB(emp)) {
            employeeList.add(emp);
            System.out.println("Employee added successfully to DB and List!");
        } else {
            System.out.println("Failed to add employee to DB.");
        }
    }

    static boolean addEmployeeToDB(EmployeePayroll emp) {
        try {
            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/payroll_service", "root", "password");

            String sql = "INSERT INTO employee_payroll (id, name, salary) VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, emp.id);
            stmt.setString(2, emp.name);
            stmt.setDouble(3, emp.salary);

            int rows = stmt.executeUpdate();
            conn.close();
            return rows == 1; 
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}

