// 14. Write a program to display the first n terms of Fibonacci series. 

// Fibonacci series 0 1 2 3 5 8 13 .....
// Test Data :
// Input number of terms to display : 10
// Expected Output :
// Here is the Fibonacci series upto to 10 terms :
// 0 1 1 2 3 5 8 13 21 34

// Code:

import java.util.Scanner;

public class Fibo {
	  public static void main(String[] args) {

	    int first = 0, second = 1;
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Input number of terms to display : ");
	    int n = sc.nextInt();
	    
	    System.out.println("Fibonacci Series till " + n + " terms:");

	    for (int i = 1; i <= n; ++i) {
	      System.out.print(first + " ");
	      int next = first + second;
	      first = second;
	      second = next;
	    }
	    sc.close();
	  }
	}