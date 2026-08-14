package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBConnection {

    private static final String URL = "jdbc:sqlite:reservation.db";

    public static Connection getConnection() {
        try {
            Connection conn = DriverManager.getConnection(URL);
            createTables(conn);
            return conn;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private static void createTables(Connection conn) {
        try {
            Statement st = conn.createStatement();

            st.execute(
                "CREATE TABLE IF NOT EXISTS users(" +
                "username TEXT PRIMARY KEY," +
                "password TEXT NOT NULL)"
            );

            st.execute(
                "CREATE TABLE IF NOT EXISTS reservations(" +
                "pnr TEXT PRIMARY KEY," +
                "passenger_name TEXT," +
                "train_number INTEGER," +
                "train_name TEXT," +
                "class_type TEXT," +
                "journey_date TEXT," +
                "source_station TEXT," +
                "destination_station TEXT)"
            );

            st.execute(
                "INSERT INTO users VALUES('admin','admin123')"
            );

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
