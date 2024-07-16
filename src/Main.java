import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Database URL
        String url = "jdbc:mysql://localhost:3306/hospital";

        //Database Credential
        String username = "root";
        String password = "Mr_Abhishek001";

        try(Connection con = DriverManager.getConnection(url, username, password)) {
            System.out.println("Connected to the Database");
        } catch(SQLException e) {
            System.err.println("Connection failed : " + e.getMessage());
        }
    }
}