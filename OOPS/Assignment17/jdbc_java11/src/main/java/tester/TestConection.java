package tester;
import static utils.DBUtils.fetchDBConnection;

import java.sql.Connection;

public class TestConection {

	public static void main(String[] args) {
		try(Connection cn=fetchDBConnection())
		{
			System.out.println("connected to DB "+cn);
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
