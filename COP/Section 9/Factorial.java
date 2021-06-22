// 7. Write a program to find the Factorial of a number using recursion?

// Code:

import java.util.Scanner;
public class Factorial
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any integer:");
        int n = s.nextInt();
        Factorial obj = new Factorial();
        System.out.println("Factorial of "+n+" :"+obj.fact(n));
    }
    int fact(int x)
    {
        if(x > 1)
        {
            return(x * fact(x - 1));
        }
        return 1;
    }
}