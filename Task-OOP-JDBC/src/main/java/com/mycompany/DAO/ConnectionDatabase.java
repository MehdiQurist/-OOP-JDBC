package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionDatabase {

    public static Connection connectDB() throws Exception {
        String url = "jdbc:mysql://localhost:3307/task-oop-jdbc";
        String username = "root";
        String password = "12345";
        Connection c = DriverManager.getConnection(url, username, password);

        return c;
    }

    public static void getCustomers() throws Exception {
        Connection c = connectDB();

        Statement st = c.createStatement();
        st.execute("select * from customers");
        ResultSet rs = st.getResultSet();

        while (rs.next()) {
            int id = rs.getInt("customerNumber");
            String name = rs.getString("customerName");
            String country = rs.getString("country");
            String city = rs.getString("city");

            System.out.println(id + " " + name + " " + country + " " + city);

            System.out.println("**********************************");
        }
    }

    public static void updateCustomer() throws Exception {
        Connection c = connectDB();

        String name = "Eli Eliyev";
        int id = 1;

        PreparedStatement st = c.prepareStatement("update customers set customerName=? where customerNumber=?");
        st.setString(1, name);
        st.setInt(2, id);
        st.execute();
    }

    public static void removeCustomer() throws Exception {
        
        int id = 4;
        
        Connection c = connectDB();
        Statement st = c.createStatement();
        st.execute("delete from customers where customerNumber = " + id);
        
    }

}
