package forum;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TryCatch {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/db";
        String username = "user";
        String password = "password";

        System.out.println("Connecting database...");

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Database connected!");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.print("Unable to connect to database");
        }
    }
}
