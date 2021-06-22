// 15. Write a program to display the number in reverse order.

// Code:

import java.util.Scanner;

public class ReverseNumber {
	  public static void main(String[] args) {
	    int rev = 0;
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Input the number : ");
	    int num = sc.nextInt();

	    while(num != 0) {
	    	int digit = num % 10;
	    	rev = rev * 10 + digit;
	    	num /= 10;
	     }
	    	    System.out.println("Reversed Number: " + rev);
	    	    sc.close();
	   }
	}