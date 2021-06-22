// 4. Write a program to calculate the monthly in hand salary of an employee : 
// 	take input for basic salary,
// 	HRA is 40% of basic salary,
// 	PF amount to be deducted is 12% of basic,
// 	Medical allowance is Rs 1200 per month, 
// 	Traveling allowance is Rs 800 per month,
// 	Professional tax to be deducted is Rs 300.

// Code:

import java.util.Scanner;

public class Salary {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
                System.out.print("Enter your basic salary: ");
		double basic = sc.nextDouble();
        
		double inhand = basic + (0.4*basic) + 1200 + 800 - (0.12*basic) - 300;
		
		System.out.println("The monthly in-hand salary is "+inhand);
		sc.close();
	}

}