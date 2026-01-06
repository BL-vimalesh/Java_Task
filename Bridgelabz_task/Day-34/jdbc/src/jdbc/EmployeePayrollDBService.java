package jdbc;


import java.sql.*;
import java.sql.Date;
import java.util.*;

// Custom exception for payroll operations
class PayrollException extends Exception {
    public PayrollException(String message, Throwable cause) {
        super(message, cause);
    }
}

public class EmployeePayrollDBService {
    private static EmployeePayrollDBService instance;  
    private Connection conn;


    private PreparedStatement payrollByNameStmt;
    private PreparedStatement payrollByDateRangeStmt;
    private PreparedStatement payrollAnalysisStmt;

    private static final String URL = "jdbc:mysql://localhost:3306/payroll_service";
    private static final String USER = "root";
    private static final String PASSWORD = "Vimalesh@281";

    // Private constructor for Singleton
    private EmployeePayrollDBService() throws PayrollException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(URL, USER, PASSWORD);

            // Cache PreparedStatements
            payrollByNameStmt = conn.prepareStatement("SELECT * FROM employee_payroll WHERE name = ?");
            payrollByDateRangeStmt = conn.prepareStatement("SELECT * FROM employee_payroll WHERE start BETWEEN ? AND ?");
            payrollAnalysisStmt = conn.prepareStatement(
                "SELECT gender, SUM(basic_pay) AS total_salary, AVG(basic_pay) AS avg_salary, " +
                "MIN(basic_pay) AS min_salary, MAX(basic_pay) AS max_salary, COUNT(*) AS employee_count " +
                "FROM employee_payroll GROUP BY gender"
            );

        } catch (Exception e) {
            throw new PayrollException("Failed to initialize DB Service", e);
        }
    }


    public static EmployeePayrollDBService getInstance() throws PayrollException {
        if (instance == null) {
            instance = new EmployeePayrollDBService();
        }
        return instance;
    }

    // UC-1: Retrieve all employees
    public List<EmployeePayroll> readAll() throws PayrollException {
        List<EmployeePayroll> list = new ArrayList<>();
        String sql = "SELECT * FROM employee_payroll";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                list.add(populateEmployee(rs));
            }
        } catch (SQLException e) {
            throw new PayrollException("Error reading all employees", e);
        }
        return list;
    }

    // UC-2 & UC-3: Update salary for Terisa and sync object
    public void updateSalary(EmployeePayroll emp, double newSalary) throws PayrollException {
        String sql = "UPDATE employee_payroll SET basic_pay=? WHERE name=?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setDouble(1, newSalary);
            stmt.setString(2, emp.name);
            int rows = stmt.executeUpdate();
            if (rows > 0) {
                emp.basicPay = newSalary; // sync object
            } else {
                throw new PayrollException("No employee found with name: " + emp.name, null);
            }
        } catch (SQLException e) {
            throw new PayrollException("Error updating salary for " + emp.name, e);
        }
    }

    // UC-5 (refactor): Retrieve payroll data by name using cached PreparedStatement
    public EmployeePayroll getPayrollDataByName(String name) throws PayrollException {
        try {
            payrollByNameStmt.setString(1, name);
            ResultSet rs = payrollByNameStmt.executeQuery();
            if (rs.next()) {
                return populateEmployee(rs);
            }
        } catch (SQLException e) {
            throw new PayrollException("Error retrieving payroll by name", e);
        }
        return null;
    }

    // UC-5: Retrieve employees by date range
    public List<EmployeePayroll> getEmployeesByDateRange(Date start, Date end) throws PayrollException {
        List<EmployeePayroll> list = new ArrayList<>();
        try {
            payrollByDateRangeStmt.setDate(1, start);
            payrollByDateRangeStmt.setDate(2, end);
            ResultSet rs = payrollByDateRangeStmt.executeQuery();
            while (rs.next()) {
                list.add(populateEmployee(rs));
            }
        } catch (SQLException e) {
            throw new PayrollException("Error retrieving employees by date range", e);
        }
        return list;
    }

    // UC-6: Payroll analysis by gender
    public void analyzePayrollByGender() throws PayrollException {
        try (ResultSet rs = payrollAnalysisStmt.executeQuery()) {
            System.out.println("Payroll Analysis by Gender:");
            while (rs.next()) {
                String gender = rs.getString("gender");
                double total = rs.getDouble("total_salary");
                double avg = rs.getDouble("avg_salary");
                double min = rs.getDouble("min_salary");
                double max = rs.getDouble("max_salary");
                int count = rs.getInt("employee_count");

                System.out.println("Gender: " + gender);
                System.out.println("  Total Salary: " + total);
                System.out.println("  Average Salary: " + avg);
                System.out.println("  Min Salary: " + min);
                System.out.println("  Max Salary: " + max);
                System.out.println("  Employee Count: " + count);
                System.out.println("-----------------------------");
            }
        } catch (SQLException e) {
            throw new PayrollException("Error performing payroll analysis", e);
        }
    }


    private EmployeePayroll populateEmployee(ResultSet rs) throws SQLException {
        return new EmployeePayroll(
                rs.getInt("id"),
                rs.getString("name"),
                rs.getString("phone_number"),
                rs.getString("address"),
                rs.getString("department"),
                rs.getString("gender"),
                rs.getDouble("basic_pay"),
                rs.getDouble("deductions"),
                rs.getDouble("taxable_pay"),
                rs.getDouble("tax"),
                rs.getDouble("net_pay"),
                rs.getDate("start")
        );
    }

    // Close resources
    public void close() {
        try {
            if (payrollByNameStmt != null) payrollByNameStmt.close();
            if (payrollByDateRangeStmt != null) payrollByDateRangeStmt.close();
            if (payrollAnalysisStmt != null) payrollAnalysisStmt.close();
            if (conn != null) conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        try {
            EmployeePayrollDBService service = EmployeePayrollDBService.getInstance();

            // UC-1: Read all
            List<EmployeePayroll> employees = service.readAll();
            employees.forEach(System.out::println);

            // UC-2 & UC-3: Update salary for Terisa
            EmployeePayroll terisa = service.getPayrollDataByName("Terisa");
            service.updateSalary(terisa, 3000000.00);

            // UC-5: Retrieve by date range
            List<EmployeePayroll> joined2020 = service.getEmployeesByDateRange(
                    Date.valueOf("2020-01-01"), Date.valueOf("2020-12-31"));
            joined2020.forEach(System.out::println);

            // UC-6: Payroll analysis
            service.analyzePayrollByGender();

            service.close();
        } catch (PayrollException e) {
            System.out.println("Custom Exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
