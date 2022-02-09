// Java and MySQL Database Connectivity

import java.sql.*;

class DatabaseConnectivity {
    public static void main(String args[]) {

        try {

            // Driver Registration
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connection Creativity
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/students", "root", "");

            // Statement Creation
            Statement st = con.createStatement();

            // Query Execution
            ResultSet rs = st.executeQuery("select * from studentsinfo;");

            // Printing the Data
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
            }

            // Closing the Connection
            con.close();

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Successful");
        }
    }
}