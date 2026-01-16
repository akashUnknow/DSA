package org.akash.solutation.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcDemo {

    private final String url = "jdbc:postgresql://localhost:5432/testdb";
    private final String user = "postgres";   // usually postgres
    private final String password = "2486";

    public void demoMethod() {
        try {
            // Optional but correct
            Class.forName("org.postgresql.Driver");

            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();
//            ResultSet rs = stmt.executeQuery("SELECT * FROM employee");
            int rowsInserted=stmt.executeUpdate("INSERT INTO employee (id,name, salary) VALUES (106,'sunny', 55000) ");
            System.out.println("Rows inserted: " + rowsInserted);
            ResultSet rs = stmt.executeQuery("SELECT * FROM employee");

            while (rs.next()) {
                System.out.println(
                        rs.getInt(1) + " " +
                                rs.getString(2) + " " +
                                rs.getString(3)
                );
            }

            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
