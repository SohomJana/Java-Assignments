import java.sql.*; public class Database {
    public Database() throws SQLException {
    }

    String url = "jdbc:mysql://localhost:3306/?user=root"; String username = "root";
    String password = "sohomsql#123";
    Connection conn = DriverManager.getConnection(url, username, password);

}
