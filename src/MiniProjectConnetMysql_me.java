import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MiniProjectConnetMysql_me {
    public static void main(String[] args) {
        // Open MySQL
            // mysql-connector J
        // Connect to Database
        // Check host name localhost port: 3306
        // Check user
        // Check Schema world
        // Check password
        final String USER = "root";
        final String PASS = "tbrs00002b";
        final String DB_URL = "jdbc:mysql://localhost/world";
        final String QUERY = "SELECT Code, NAME, Continent, Region " +
                            "FROM Country " +
                            "WHERE  1 = 1 " +
                            "AND Name LIKE '%an%' ";
        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            // Make Statments
            Statement stmt = conn.createStatement();
            // Input Query on statement
            ResultSet rs = stmt.executeQuery(QUERY);
            // Get result from Query
            while (rs.next()) {
                // Retrieve by column name
                System.out.print("Code: " + rs.getString("Code"));
                System.out.print(", NAME: " + rs.getString ("Name"));
                System.out.println(", Continent: " + rs.getString("Continent"));
                System.out.println(", Region: " + rs.getString("Region"));
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    
}
