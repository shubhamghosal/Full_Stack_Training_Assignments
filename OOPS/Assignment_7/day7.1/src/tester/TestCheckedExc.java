package tester;

import static java.lang.Thread.sleep;

public class TestCheckedExc {

	public static void main(String[] args) {
		try {
			System.out.println("Before");
			sleep(5000);
			System.out.println("After");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over...");

	}

}
