package tester;

import static utils.HibernateUtils.getSf;

import java.util.Scanner;

import org.hibernate.*;

import dao.UserDaoImpl;

public class SaveImage {

	public static void main(String[] args) {
		try (SessionFactory sf = getSf(); Scanner sc = new Scanner(System.in)) {
			// create dao instance
			UserDaoImpl dao = new UserDaoImpl();
			System.out.println("Enter email");
			String email=sc.nextLine();
			System.out.println("Enter file name with path");
			String path= sc.nextLine();
			System.out.println(email+":"+path);
			System.out.println(dao.saveImage(email,path));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
