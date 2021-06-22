// 5. Write a recursive program to print Fibonacci Series for given number of terms?

//  Input number of terms for the Series (< 20) : 10                                
//  The Series are :                                                                
//  1  1  2  3  5  8  13  21  34  55 
// Code:

import java.util.Scanner;
 
public class FiboRecurssion
{
	
    public static void main(String args[]) 
    {
    	Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num=sc.nextInt();
    	System.out.println("Fibonacci Series of "+num+" numbers: ");
    	for(int i = 1; i <= num; i++)
    	{
	 	System.out.print(fibonacci(i) +" ");
    	}
    	sc.close();
     }
    static int fibonacci(int n)
    {
    	if(n == 0)
    	{
    		return 0;
    	}
    	if(n == 1 || n == 2)
    	{
    		return 1;
    	}
    	return fibonacci(n-2) + fibonacci(n-1);
    }
}