package day2;

import java.sql.DriverManager;

import java.sql.Connection;



public class jdbcUtils {
	public static Connection buildConnection() throws Exception {
		String driverClassName = "com.mysql.cj.jdbc.Driver";
		Class.forName(driverClassName);
		String connectionUrl = "jdbc:mysql://localhost:3306/cdac_nov_23?useSSL=false";
		String userId = "root";
		String password = "root";
			
		Connection	dbConnection = DriverManager.getConnection(connectionUrl, userId, password);
		return dbConnection;
	}
}

