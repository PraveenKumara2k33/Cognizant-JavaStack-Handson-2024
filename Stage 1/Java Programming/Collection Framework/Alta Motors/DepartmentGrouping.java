import java.util.HashSet;

public class DepartmentGrouping {

    private HashSet<String> employeeSet;

    public DepartmentGrouping() {
        employeeSet = new HashSet<>();
    }

    public HashSet<String> getEmployeeSet() {
        return employeeSet;
    }

    public void setEmployeeSet(HashSet<String> employeeSet) {
        this.employeeSet = employeeSet;
    }

    public void addEmployeeId(String details) {
        String employeeId = details.split(":")[0];
        if (employeeId.matches("^[PQMS]\\d{3}$")) {
            employeeSet.add(employeeId);
        }
    }

    public HashSet<String> findDepartmentNameWithEmployeeId() {
        HashSet<String> departmentSet = new HashSet<>();
        for (String employeeId : employeeSet) {
            String department = "";
            switch (employeeId.charAt(0)) {
                case 'P':
                    department = "Product";
                    break;
                case 'Q':
                    department = "Quality Control";
                    break;
                case 'M':
                    department = "Maintenance";
                    break;
                case 'S':
                    department = "Sales";
                    break;
            }
            departmentSet.add(employeeId + ":" + department);
        }
        return departmentSet;
    }
}
