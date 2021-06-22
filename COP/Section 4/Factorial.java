// 4. Write a program to calculate the factorial of the given number?

// Code:

import java.util.Scanner;

public class Factorial
{  
	 public static void main(String args[])
	 {  
	  int fact=1;  
	  Scanner sc = new Scanner(System.in);
	  System.out.print("Enter a number: ");
	  int num = sc.nextInt();
	  for(int i=1 ; i<=num ; i++)
	  {    
	      fact=fact*i;    
	  }    
	  System.out.println("Factorial of "+num+" is: "+fact);  
	  sc.close();  
	 }  

}  