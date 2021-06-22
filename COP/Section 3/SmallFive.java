// 10. Write a program to find the smallest of five numbers?

// Code:

import java.util.Scanner;

public class SmallFive
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
	
        System.out.print("Enter Five Numbers : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();
        int n5 = sc.nextInt();
		
        if(n1<n2 && n1<n3 && n1<n4 && n1<n5)
        {
            System.out.println("Smallest number is " +n1);
        }
        else if(n2<n1 && n2<n3 && n2<n4 && n2<n5)
        {
            System.out.println("Smallest number is " +n2);
        }
        else if(n3<n1 && n3<n2 && n3<n4 && n3<n5)
        {
            System.out.println("Smallest number is " +n3);
        }
        else if(n4<n1 && n4<n2 && n4<n3 && n4<n5)
        {
            System.out.println("Smallest number is " +n4);
        }
        else
        {
            System.out.println("Smallest number is " +n5);
        }
	
        sc.close();
    }
} 