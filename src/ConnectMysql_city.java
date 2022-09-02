import java.sql.*;

public class ConnectMysql_city {
   static final String DB_URL = "jdbc:mysql://localhost/world";
   static final String USER = "root";
   static final String PASS = "tbrs00002b";
   static final String QUERY = "SELECT ID, NAME, CountryCode, District, Population " + 
                                "FROM city";

   public static void main(String[] args) {
      // Open a connection
      try {
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS); // schema에 접속, 연결
        Statement stmt = conn.createStatement(); //Statement Query editor 창 띄우기
        ResultSet rs = stmt.executeQuery(QUERY); // Query를 실행해서 결과를 받음
         // Extract data from result set
         while (rs.next()) {
            // Retrieve by column name
            System.out.print("ID: " + rs.getInt("id"));
            System.out.print(", NAME: " + rs.getString ("name"));
            System.out.print(", CountryCode: " + rs.getString("CountryCode"));
            System.out.print(", District: " + rs.getString("District"));
            System.out.println(", Population: " + rs.getInt("Population"));
         }
      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }
}