package utils;
import java.sql.*;

public interface DBUtils {
//add a static method for getting a FIXED DB connection
	static Connection fetchDBConnection() throws ClassNotFoundException,SQLException
	{
		//load Type IV MySql supplied JDBC driver class , under method area (meta space)
		Class.forName("com.mysql.cj.jdbc.Driver");
		//get the fixed connection to DB
		String url="jdbc:mysql://localhost:3306/test?useSSL=false&allowPublicKeyRetrieval=true";
		return DriverManager.getConnection(url, "root", "root");
	}
	
}
