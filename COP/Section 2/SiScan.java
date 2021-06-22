// 3. Write a java program to calculate simple interest, get the required inputs 
// from Scanner ?
// Hint :  SI = (principal * rate * years)/100

// Code:

import java.util.Scanner;

public class SiScan {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
                System.out.print("Enter the principal amount: ");
		double p = sc.nextDouble();
                System.out.print("Enter rate: ");
		double r = sc.nextDouble();
                System.out.print("Enter time: ");
		double t = sc.nextDouble();
		
		double si = (p*r*t)/100;
		System.out.println("Simple interest: "+si);
		sc.close();
	}

}