package utils;

import java.sql.*;

public class DBUtilsRegister {
	private static Connection cn;

	public static Connection fetchConnection() throws ClassNotFoundException, SQLException {
		if (cn == null) {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/test?useSSL=false&allowPublicKeyRetrieval=true";

			cn = DriverManager.getConnection(url, "root", "quantum@123");
		}
		return cn;
	}

}
