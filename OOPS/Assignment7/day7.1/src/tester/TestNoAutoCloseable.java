package tester;

import java.util.Scanner;

public class TestNoAutoCloseable {

	public static void main(String[] args) {
		Scanner sc=null ;
		try {
			sc= new Scanner(System.in);
			System.out.println("int value " + Integer.parseInt("a1234"));
		} finally {
			sc.close();
		}
	}

}
