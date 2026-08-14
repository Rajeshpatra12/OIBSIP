import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DatabaseManager {

    private static final String URL =
            "jdbc:sqlite:exam.db";

    public static Connection getConnection() {

        try {

            return DriverManager.getConnection(URL);

        } catch (Exception e) {

            e.printStackTrace();
        }

        return null;
    }

    public static boolean validateUser(
            String username,
            String password) {

        try {

            Connection con =
                    getConnection();

            String sql =
                    "SELECT * FROM users "
                            + "WHERE username=? "
                            + "AND password=?";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet rs =
                    ps.executeQuery();

            return rs.next();

        } catch (Exception e) {

            e.printStackTrace();
        }

        return false;
    }

    public static void updateUser(
            String username,
            String displayName,
            String password) {

        try {

            Connection con =
                    getConnection();

            String sql =
                    "UPDATE users "
                            + "SET displayName=?, "
                            + "password=? "
                            + "WHERE username=?";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setString(1, displayName);
            ps.setString(2, password);
            ps.setString(3, username);

            ps.executeUpdate();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    public static void createTables() {

        try {

            Connection con =
                    getConnection();

            String sql =
                    "CREATE TABLE IF NOT EXISTS users("
                            + "username TEXT PRIMARY KEY,"
                            + "password TEXT,"
                            + "displayName TEXT)";

            con.createStatement()
                    .execute(sql);

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}