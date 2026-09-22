package TestData;

import org.testng.annotations.Test;

import java.sql.*;

public class readFromDataBase {

    public static String studentUsername;
    public static String studentPassword;


    public static void dbConnector() {

        String dbUrl = "jdbc:mysql://102.222.124.22:3306/ndosian6b8b7_teaching";
        String dbUsername = "ndosian6b8b7_teaching";
        String dbPassword = "^{SF0a=#~[~p)@l1";

        try (Connection connection = DriverManager.getConnection(dbUrl, dbUsername, dbPassword)) {
            try (Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery("SELECT * FROM thaps_users WHERE id = 1")) {

                while (resultSet.next()) {
                    studentUsername = resultSet.getString("email");
                    studentPassword = resultSet.getString("password");
                    //System.out.println("Email: " + getUsername + " password:" + getPassword);
                }

            }
        } catch (SQLException e) {
            System.out.println("Query Execution Error" + e.getMessage());
        }
    }

}