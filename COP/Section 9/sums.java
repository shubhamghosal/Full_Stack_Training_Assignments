// 6. Write a program to find the sum of digits of a number using recursion?
// Code:

import java.util.Scanner;

public class sums
{
    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        int result = sum_of_digit(num);
        System.out.println("Sum of digits in " +num + " is " + result);
        sc.close();
        
    }
    static int sum_of_digit(int n)
    {
        if (n == 0)
        {
            return 0;
        }
        return (n % 10 + sum_of_digit(n / 10));
    }
}