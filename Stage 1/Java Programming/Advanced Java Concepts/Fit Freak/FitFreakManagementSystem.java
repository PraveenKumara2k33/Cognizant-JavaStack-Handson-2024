import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FitFreakManagementSystem {

    public List<FitFreak> retrieveFitFreakListBasedOnAge(int age) {
        List<FitFreak> fitFreakList = new ArrayList<>();
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = DB.getConnection();
            String sql = "SELECT * FROM fitfreak WHERE age <= ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, age);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                String fitnessId = rs.getString("fitnessId");
                String name = rs.getString("name");
                String gender = rs.getString("gender");
                int fitAge = rs.getInt("age");
                double height = rs.getDouble("height");
                double weight = rs.getDouble("weight");

                FitFreak fitFreak = new FitFreak(fitnessId, name, gender, fitAge, height, weight);
                fitFreakList.add(fitFreak);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeResources(rs, pstmt, conn);
        }

        return fitFreakList;
    }

    private void closeResources(ResultSet rs, PreparedStatement pstmt, Connection conn) {
        try {
            if (rs != null) rs.close();
            if (pstmt != null) pstmt.close();
            if (conn != null) conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
