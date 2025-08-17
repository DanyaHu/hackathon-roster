

public class Database {
    private static final String DB_URL = "jdbc:sqlite:application.db";

    public static Connection getConnection() throws SQLException {
        try {
            return DriveManager.getConnection(DB_URL);
        } catch (SQLException e) {
            System.err.println("Error connecting!");
            throw new RuntimeException(e);
        }
    }
}