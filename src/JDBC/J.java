package JDBC;
import java.sql.*;

public class J {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "Nithish@3";

        try (
                Connection conn = DriverManager.getConnection(url, user, password);
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM `new`");
        ) {
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                System.out.println(id + " " + name);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
