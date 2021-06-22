// 3. Write a program to calculate the product of two integers using recursion? (Multiplication & Division operators are not allowed)
// Code:

import java.util.Scanner;
 
public class MulRecursion
{
	public static void main (String[] args)
    {
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the two integers to multiply(using recursion): ");
	    int x=sc.nextInt();
	    int y=sc.nextInt();
        System.out.println("Result : "+product(x, y));
        sc.close();
    }
    static int product(int x, int y)
    {
        if (x < y)
        {
        	return product(y, x);
        }    
        else if (y != 0)
        {
            return (x + product(x, y - 1));
        }
        else
        {
        	return 0;
        }    
    }
}