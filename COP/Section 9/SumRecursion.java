// 2. Write a java program to calculate the sum of numbers from 1 to N using recursion? 

// Code:
import java.util.Scanner;

public class SumRecursion
{
 public static void main(String args[])
 {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter terms to add: ");
     int num=sc.nextInt();
 
     System.out.println("Summation of first "+num+" natural numbers = "+sum(num));
     sc.close();
 }

 static int sum(int n)
 {
     if(n==0)
     {
    	 return n;
     }
     else 
     {
    	 return (n+sum(n-1));
     }  
 }
}