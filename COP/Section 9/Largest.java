// 8. Write a program to get the largest element of an array using recursion?

// Code:

import java.util.Scanner;
 
public class Largest {
 public static int findMaxRec(int A[], int n)
	    {
	      if(n == 1)
	      {
	    	  return A[0];  
	      }
	        return Math.max(A[n-1], findMaxRec(A, n-1));
	    }

    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter length of array: ");
    	int n = sc.nextInt();
    	
    	System.out.print("Enter the "+n+" array elements: ");
    	int[] A = new int[10]; 
    	for(int i=0; i<n; i++)  
    	{  
    		A[i]=sc.nextInt();  
    	}  
    	System.out.print("Largest element of the array is: "+findMaxRec(A, n));
        sc.close();
    }
}