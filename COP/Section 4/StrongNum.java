// 17.  Write a program to check whether a given number is a Strong Number or not?
// Note : If sum of factorial of each digit of a number is equal to that number, then that number is called strong number.

// Code:

import java.util.Scanner;
public class StrongNum
{
	public static void main(String[] args) 
	{
		int n,i, fact,last;
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the number : " );
		n = sc.nextInt();
		int total = 0;
		int temp_n = n;
		while(n != 0)
		{
			i = 1;
			fact = 1;
			last = n % 10;
			while(i <= last)
			{
				fact = fact * i;
				i++;
			}
			total = total + fact;
			n = n / 10;
		}
		if(total == temp_n)
			System.out.println(temp_n + " is a strong number\n");
		else
			System.out.println(temp_n + " is not a strong number\n");
		System.out.println();
		sc.close();
	}
}