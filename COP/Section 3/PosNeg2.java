// 7. Write a java program to read a number entered by user. Print -1 if  this number is negative, 1 if it is positive, 0 if it is neither positive nor negative?

// Code:

import java.util.Scanner;
public class PosNeg2 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number you want to check: ");
        int n = s.nextInt();
        if(n > 0)
        {
            System.out.println("1");
        }
        else if(n < 0)
        {
            System.out.println("-1");
        }
        else
        {
            System.out.println("0");
        }
        s.close();
    }
}