// 2. Write a java program to take 5 numbers using Scanner and print the average ?

// >> Enter 5 numbers : 1 2 3 4 5
// Average = 3

// >> Enter 5 numbers : 2 3 5 7 9
// Average = 5.2

// Code:

import java.util.Scanner;

public class AvgScan {

	public static void main(String[] args) {
		
		System.out.print("Enter 5 numbers: ");
		Scanner sc = new Scanner(System.in);
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		double n3 = sc.nextDouble();
		double n4 = sc.nextDouble();
		double n5 = sc.nextDouble();
		
		double avg = (n1+n2+n3+n4+n5)/5;
		System.out.println("Average: "+avg);
		sc.close();
	}

}