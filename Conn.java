package org.yourcompany.yourproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {

    Connection c;
    Statement s;

    public Conn() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            String url =
                "jdbc:sqlserver://localhost:1433;" +
                "databaseName=bankmanagementSystem;" +
                "encrypt=true;" +
                "trustServerCertificate=true;" +
                "user=tanish;" +
                "password=Tanish@123";

            c = DriverManager.getConnection(url);
            s = c.createStatement();

            System.out.println("Connected Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}