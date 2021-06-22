// 16. Write a program to check whether a number is a palindrome or not.
// Note: If reverse of a number is same as that of number , then it is called palindrome. eg. 11, 151, 121,

// Code:

import java.util.Scanner;

public class Palindrome {
	  public static void main(String[] args) 
	  {
	    int rev = 0, rem;
	    
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Input the number : ");
	    int num = sc.nextInt();
	    int original = num;

	    while (num != 0) 
	    {
	      rem = num % 10;
	      rev = rev * 10 + rem;
	      num /= 10;
	    }
	    if (original == rev) {
	      System.out.println(original + " is a Palindrome.");
	    }
	    else {
	      System.out.println(original + " is not a Palindrome.");
	    }
		sc.close();
	  }
}