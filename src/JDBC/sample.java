package JDBC;

import java.sql.*;

public class sample {
    public static void main(String[] args) throws Exception {
        String URL = "jdbc://localhost:3306/iseTestDB";
        String user = "root";
        String password = "test1234";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = null;

        conn = DriverManager.getConnection(URL,user,password);
        System.out.println("connection established");

        Statement st = conn.createStatement();

        ResultSet rs = st.executeQuery("select * from Faculty");

        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("Firstname");

            System.out.println("ID: " + id + "\tName: " + name);
        }
        st.close();
        conn.close();
        System.out.println("connection closed");

    }
}
