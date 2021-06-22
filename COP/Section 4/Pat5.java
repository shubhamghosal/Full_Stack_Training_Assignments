// 9. Write a program to make such a pattern like a pyramid with an asterisk, as show below : 
//    * 
//   * * 
//  * * * 
// * * * *

// Code:

import java.util.Scanner;

public class Pat5
{  
	public static void pyramidPattern(int n) 
    {  
        for (int i=0; i<n; i++) 
        { 
        	for (int j=n-i; j>1; j--) 
            { 
                System.out.print(" "); 
            }  
            for (int j=0; j<=i; j++ ) 
            { 
                System.out.print("* "); 
            } 
  
            System.out.println(); 
        } 
    } 
  
    public static void main(String args[]) 
    { 
        Scanner sc = new Scanner(System.in);   
        System.out.print("Enter number of rows: ");    
        int n = sc.nextInt();
        pyramidPattern(n); 
        sc.close();
    } 
}