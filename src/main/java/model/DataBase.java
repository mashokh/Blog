package model;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {

    private static final String username = "root";
    private static final String password = "neskvicha2";
    private static final String server = "localhost";
    private static final String db = "db";

    private static Connection connection;

    static {
        try {Class.forName("com.mysql.jdbc.Driver"); } catch (ClassNotFoundException e) {  e.printStackTrace(); }
        try {connection = DriverManager.getConnection("jdbc:mysql://" + server + "/" + db, username, password); } catch (SQLException throwables) { throwables.printStackTrace(); }
    }

    public static Connection getConnection() { return connection;}


}
