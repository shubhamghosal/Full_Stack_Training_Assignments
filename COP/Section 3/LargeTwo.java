// 8. Write a program to find the largest of two numbers?

// Code:

import java.util.Scanner;

public class LargeTwo
{
    public static void main(String args[])
    {
        int a, b;
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter Two Numbers : ");
        a = sc.nextInt();
        b = sc.nextInt();
		
        if(a>b)
        {
            System.out.print("Largest of the Two Numbers is " +a);
        }
        else
        {
            System.out.print("Largest of the Two Numbers is " +b);
        }
	
        sc.close();
    }
}