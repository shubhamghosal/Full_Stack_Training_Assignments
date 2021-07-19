package tester;

import static utils.HibernateUtils.getFactory;

import java.time.LocalDate;
import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.IVendorDao;
import dao.VendorDaoImpl;

public class DeleteVendorDetails {

	public static void main(String[] args) {
		try (SessionFactory sf = getFactory(); Scanner sc = new Scanner(System.in)) {
			IVendorDao vendorDao = new VendorDaoImpl();
			System.out.print("Enter reg amount and date(yyyy-MM-dd) ");
			String v = vendorDao.deleteVendorDetails(sc.nextDouble(), LocalDate.parse(sc.next()));
			System.out.println(v);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
