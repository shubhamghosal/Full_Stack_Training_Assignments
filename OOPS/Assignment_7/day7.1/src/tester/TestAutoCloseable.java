package tester;

import java.io.FileReader;
import java.util.Scanner;

public class TestAutoCloseable {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in);
		// fr
		// db
		) {

			System.out.println("int value " + Integer.parseInt("a1234"));
		} // db.close(), fr.close() , sc.close();
	}

}
