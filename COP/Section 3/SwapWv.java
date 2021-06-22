// 2. Write a java program to swap two numbers stored in local variables without using additional variable?

// Code:

import java.util.Scanner;  
public class SwapWv  
{  
    public static void main(String a[])   
    {   
        System.out.print("Enter the two numbers to swap: ");  
        Scanner sc = new Scanner(System.in);  
        int n1 = sc.nextInt();  
        int n2 = sc.nextInt();  
        System.out.println("Before swapping numbers: "+n1 +" "+ n2);  
        n1 = n1 + n2;   
        n2 = n1 - n2;   
        n1 = n1 - n2;   
        System.out.println("After swapping: "+n1 +" " +n2);  
        sc.close();
    }   
}  