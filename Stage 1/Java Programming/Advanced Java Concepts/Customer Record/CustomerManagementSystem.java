import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CustomerManagementSystem {
    
    public int insertCustomerRecordsToDB(Customer customerObj) {
        if (!CustomerUtility.validateCustomerEmail(customerObj.getEmail())) {
            return 0;
        }

        if (customerObj.getPhoneNo().length() != 10 || !customerObj.getPhoneNo().matches("\\d{10}")) {
            return 0;
        }

        try (Connection conn = DB.getConnection()) {
            String query = "INSERT INTO customer (id, name, email, phoneNo) VALUES (?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, customerObj.getId());
            pstmt.setString(2, customerObj.getName());
            pstmt.setString(3, customerObj.getEmail());
            pstmt.setString(4, customerObj.getPhoneNo());
            
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                return 1;
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
