
import java.sql.*;

public class LibraryDAO {
    public void addBook(Book book) {
        try (Connection con = DBConnection.getConnection()) {
            String query = "INSERT INTO books VALUES (?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, book.getId());
            pst.setString(2, book.getTitle());
            pst.setString(3, book.getAuthor());
            pst.setInt(4, book.getQuantity());
            int rows = pst.executeUpdate();
            if (rows > 0) {
                System.out.println("✅ Book added successfully!");
            } else {
                System.out.println("❌ Failed to add book.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
