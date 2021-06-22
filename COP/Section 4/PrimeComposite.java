// 13. Write a program to determine whether a given number is prime or not?

// Code:

import java.util.Scanner;

public class PrimeComposite
{
    public static void main(String args[])
    {
        int num, i, count=0;
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter a Number : ");
        num = sc.nextInt();
        sc.close();
        for(i=2; i<num; i++)
        {
            if(num%i == 0)
            {
                count++;
                break;
            }
        }
        if(num == 1)
        {
            System.out.print(num +" is neither Prime nor Composite Number");
        }
        else if(count == 0)
        {
            System.out.print(num+" is a Prime Number");
        }
        
        else
        {
            System.out.print(num+" is not a Prime Number");
        }
        
    }
}