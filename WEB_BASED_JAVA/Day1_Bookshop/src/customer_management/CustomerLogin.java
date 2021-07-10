package customer_management;

import static utils.DBUtils.fetchConnection;

import java.sql.*;
import java.util.Scanner;

public class CustomerLogin {

	public static void main(String[] args) {
		String sql = "select * from customers where email = ? and password = ? ";
		try (Scanner sc = new java.util.Scanner(System.in);
				Connection cn = fetchConnection();
				PreparedStatement pst = cn.prepareStatement(sql);) {
			System.out.println("Enter email and password: ");
			pst.setString(1, sc.next());
			pst.setString(2, sc.next());

			try (ResultSet rst = pst.executeQuery()) {
				if (rst.next()) {
					System.out.println("Login Successful!!!");
					System.out.printf("ID: %d Name: %s  reg_amt: %f " + "reg_date: %s Role: %s %n", rst.getInt(1),
							rst.getString(2), rst.getDouble(5), rst.getDate(6), rst.getString(7));

				} else
					System.out.println("Invalid Login");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
