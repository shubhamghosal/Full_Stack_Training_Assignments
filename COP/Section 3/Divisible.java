// 15. Write a java program to check if a given number is divisble by 3 and 5 ? 

// Code:

import java.util.Scanner;
public class Divisible {

    
  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = in.nextInt();

        if (num%3==0 && num%5!=0)
        {
            System.out.println(num + " is only divisible by 3.");
        }
        else if(num%3!=0 && num%5==0)
        {
            System.out.println(num + " is only divisible by 5.");
        }
        else if(num%3==0 && num%5==0)
        {
            System.out.println(num + " is divisible by both 3 and 5.");
        }
        else
        {
        	System.out.println(num + " is neither divisible by 3 nor 5.");
        }
        in.close();
    }
}