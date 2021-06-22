// 3. Write a java program to accept two integers and check whether they are equal or not?
// >> Enter two integers : 15 15
//  first and second number are equal.

// Code:

import java.util.Scanner;
public class EqualInteger
{
    public static void main(String[] args) 
    {
        int m, n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the two integers to check:");
        m = s.nextInt();
        n = s.nextInt();
        if(m == n)
        {
            System.out.println(m+" and "+n+" are equal ");
        }
        else
        {
            System.out.println(m+" and "+n+" are not equal ");
        }
        s.close();
    }
}