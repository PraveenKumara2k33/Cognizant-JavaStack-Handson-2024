import java.sql.*;
import java.util.ArrayList;

public class EmployeeManagementSystem {
    public ArrayList<Employee> viewEmployeesByDepartmentAndExperience(String department, int experience) {
        ArrayList<Employee> employees = new ArrayList<>();
        
        try (Connection connection = DB.getConnection()) {
            String query = "SELECT * FROM employee WHERE department = ? AND experience >= ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, department);
            preparedStatement.setInt(2, experience);
            
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int employeeId = resultSet.getInt("employeeId");
                String employeeName = resultSet.getString("employeeName");
                String dept = resultSet.getString("department");
                double salary = resultSet.getDouble("salary");
                int exp = resultSet.getInt("experience");
                
                Employee employee = new Employee(employeeId, employeeName, dept, salary, exp);
                employees.add(employee);
            }
        } catch (SQLException | ClassNotFoundException e ) {
            e.printStackTrace();
        }
        
        return employees;
    }
}
