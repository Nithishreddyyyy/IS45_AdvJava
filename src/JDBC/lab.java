//package JDBC;
//
//import java.sql.*;
//
//public class lab {
//    public static void main(String[] args) {
//        // Database credentials
//        String url = "jdbc:mysql://localhost:3306/temp";
//        String username = "root"; // <-- Replace with your MySQL username if different
//        String password = "test1234"; // <-- Replace with your MySQL password
//
//        try {
//            // Load MySQL JDBC driver (optional from JDBC 4.0+, but good practice)
//            //Class.forName("com.mysql.cj.jdbc.Driver");
//
//            // Establish connection
//            Connection con = DriverManager.getConnection(url, username, password);
//            System.out.println("Connected");
//
//            // Create statement and execute query
//            Statement s1 = con.createStatement();
//            ResultSet rs = s1.executeQuery("SELECT * FROM student");
//
//            System.out.println("Roll\tName\tCity");
//
//            // Process results
//            while (rs.next()) {
//                int r = rs.getInt("rollno");
//                String n = rs.getString("name");
//                String c = rs.getString("city");
//                System.out.println(r + "\t" + n + "\t" + c);
//            }
//
//            // Close resources
//            rs.close();
//            s1.close();
//            con.close();
//            System.out.println("Connection closed.");
//
//        } catch (SQLException | ClassNotFoundException e) {
//            e.printStackTrace(); // Better error reporting than RuntimeException
//        }
//    }
//}
