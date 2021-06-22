package tester;

import java.util.Scanner;
import static utils.ValidationRules.validateSpeed;

public class TestCustomException {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter current speed");
			validateSpeed(sc.nextInt());
			System.out.println("end of try....");
		} catch (Exception e) {
			e.printStackTrace();
		//	System.out.println(e.getMessage());
		}
		System.out.println("main over....");

	}

}
