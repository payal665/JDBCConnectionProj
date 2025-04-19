import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/library_db";
            String user = "root";
            String pass = "W7301@jqir#";

            conn = DriverManager.getConnection(url, user, pass);
            System.out.println("✅ Connected to DB!");
        } catch (ClassNotFoundException e) {
            System.err.println("❌ JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("❌ Failed to connect to the database.");
            e.printStackTrace();
        }
        return conn;
    }

    public static void main(String[] args) {
        Connection conn = getConnection();
        if (conn != null) {
            try {
                conn.close();
                System.out.println("🔒 Connection closed.");
            } catch (SQLException e) {
                System.err.println("⚠️ Error while closing the connection.");
                e.printStackTrace();
            }
        }
    }
}


