// 5. Write a program to display the pattern like right angle triangle using an asterisk as shown below:

// *
// **
// ***
// ****

// Code:

import java.util.Scanner;

public class Pat1 { 
	public static void main(String args[]) { 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows");
        int n = sc.nextInt(); 
        rightTriangle(n);
        sc.close();
} 
   public static void rightTriangle(int n) 
	    { 
	        int i, j;  
	        for(i=0; i<n; i++) 
	            {           
	                System.out.print(" "); 
	         
	            for(j=0; j<=i; j++) 
	            {       
	                System.out.print("*"); 
	            }  
	             System.out.println();
	           } 
	     }
	}