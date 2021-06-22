// 14. Write a Java program that takes a year from user and print whether that year is a leap year or not.

// Hint : a leap year is divisible by 4 and (not div by 100 or  if div by both 100 &400)

// Code:

import java.util.Scanner;
public class Leap {

    
  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Input the year: ");
        int year = in.nextInt();

        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100 == 0) && (year % 400 == 0));

        if (x && (y || z))
        {
            System.out.println(year + " is a leap year");
        }
        else
        {
            System.out.println(year + " is not a leap year");
        }
        in.close();
    }
}