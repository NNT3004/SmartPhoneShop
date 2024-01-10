package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbCon {
	private static Connection connection = null;
	public static Connection getConnection() throws ClassNotFoundException, SQLException{
        if(connection == null){
            String server = "localhost";
            String port = "3306";
            String database = "smartphoneshop";
            String user = "root";
            String password = "";
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = java.sql.DriverManager.getConnection("jdbc:mysql://" + server + ":" + port + "/" + database + "?verifyServerCertificate=true&useSSL=false&allowPublicKeyRetrieval=true", user, password);
            System.out.print("connected");
        }
        return connection;
    }
}
