package tester;

import static utils.HibernateUtils.getSf;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.CourseDaoImpl;

public class CancelCourse {

	public static void main(String[] args) {
		try (SessionFactory sf = getSf(); Scanner sc = new Scanner(System.in)) {
			CourseDaoImpl courseDao = new CourseDaoImpl();
			System.out.println("Enter course id to cancel: ");
			System.out.println(courseDao.cancelCourse(sc.nextInt()));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
