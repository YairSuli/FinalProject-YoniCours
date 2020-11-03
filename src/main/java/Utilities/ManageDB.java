package Utilities;

import java.sql.DriverManager;

public class ManageDB extends CommonOps {

    public static void initConnection(String dbUrl, String user, String pass) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(dbUrl, user, pass);
            stmt = con.createStatement();
        } catch (Exception e) {
            System.out.println("Error Ocuured while Connecting to DB, see details: " + e);
        }
    }

    public static void closeConnections() {
        try {
            con.close();
        } catch (Exception e) {
            System.out.println("Error Ocuured while Closing to DB, see details: " + e);
        }
    }
}
