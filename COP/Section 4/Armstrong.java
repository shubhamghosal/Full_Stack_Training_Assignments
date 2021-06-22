// 12. Write a program to check whether a given number is an armstrong number or not?

// Note : When the sum of the cube of the individual digits of a number is equal to that number, the number is called Armstrong number. For Example 153 is an Armstrong number because 153 = 1^3 +5^3 + 3^3.

// Code:

import java.util.Scanner;
public class Armstrong {
   public static void main(String args[]) {
      int check, rem, sum = 0;
      System.out.print("Enter the number to be checked: ");
      Scanner sc = new Scanner(System.in);
      int number = sc.nextInt();
      check = number;
      while(check != 0) 
      {
         rem = check % 10;
         sum = sum + (rem * rem * rem);
         check = check / 10;
      }
      if(sum == number)
         System.out.println(number+" is an armstrong number.");
      else
         System.out.println(number+" is not an armstrong number.");
      sc.close();
   }
}