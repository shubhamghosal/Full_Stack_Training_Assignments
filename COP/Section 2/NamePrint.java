// 1. Write a program to take "name" from user using Scanner and greet as shown below-

// >> Enter your name : Shakir
// Hello Shakir , Welcome to Java World.

// Code:

import java.util.Scanner;

public class NamePrint {

	public static void main(String[] args) {
		
		System.out.println("Enter name: ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("Hello "+name +", Welcome to java world.");
		sc.close();
	}

}