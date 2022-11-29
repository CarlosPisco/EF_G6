package Daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class DaoBase {

    public Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch(ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String user= "root";
        String pass="root";
        String passBD= "merci2022";
        String IP = "35.199.156.123";
        String localhost = "localhost";
        String url = "jdbc:mysql://"+localhost+":3306/EF_G6?serverTimezone=America/Lima";

        return DriverManager.getConnection(url,user,pass);
    }
}