package tester;

import static utils.HibernateUtils.getFactory;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.IVendorDao;
import dao.VendorDaoImpl;

public class VendorLogin {
	public static void main(String[] args) {
		try (SessionFactory sf = getFactory(); Scanner sc = new Scanner(System.in)) {
			IVendorDao vendorDao = new VendorDaoImpl();
			System.out.print("Enter email and password: ");
			String v = vendorDao.authenticateVendor(sc.next(), sc.next());
			System.out.println(v);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
