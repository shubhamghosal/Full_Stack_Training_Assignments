package customer_management;

import static utils.DBUtils.fetchConnection;

import java.sql.*;
import java.util.Scanner;
import java.sql.Date;

public class CustomerRegister {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		String sql = "insert into customers(name, email, password, reg_amt, reg_date, role) values (?, ?, ?, ?, ?, ?)";

		try (Scanner sc = new java.util.Scanner(System.in);

				Connection cn = fetchConnection();
				PreparedStatement pst = cn.prepareStatement(sql);

		) {
			System.out.println(
					"Enter customer registration details: name, email, password, registration amount, registration date (YYYY-MM-DD), role");
			pst.setString(1, sc.next());
			pst.setString(2, sc.next());
			pst.setString(3, sc.next());
			pst.setDouble(4, sc.nextDouble());
			pst.setDate(5, Date.valueOf(sc.next())); // date
			pst.setString(6, sc.next());

			int rowsCount = pst.executeUpdate();
			try {
				boolean exit = false;

				while (!exit) {

					if (rowsCount == 1) {
						System.out.println("Registration successful");
						exit = true;
					}

					else {
						System.out.println("Login Failed");
						exit = true;
					}
				}

			} catch (Exception e) {
				System.out.println("Login Failed");
				e.printStackTrace();
			}
		}
	}

}
