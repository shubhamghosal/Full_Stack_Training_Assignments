// 11. Write a program to check whether a given number is a perfect number or not?

// Note : 
// Defintion of Perfect Number : sum of all divisor of the number is equal to the number itself. 
// eg.  Number = 6 is perfrect because
//      All positive divisor = 1 2 3, their sum=6 

// Code:

import java.util.Scanner;
public class Perfect
{
    public static void main(String[] args) 
    {
        int n, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to check: ");
        n = sc.nextInt();
        for(int i = 1; i < n; i++)
        {
            if(n % i == 0)
            {
                sum = sum + i;
            }
        }
        if(sum == n)
        {
            System.out.println(n +" is a Perfect Number");
        }
        else
        {
            System.out.println(n +" is not a Perfect Number");
        }  
        sc.close();
    }

}