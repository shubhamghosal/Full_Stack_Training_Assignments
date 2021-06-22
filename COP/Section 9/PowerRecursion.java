// 4. Write a program to calculate the power of any number using recursion?
// Code:

import java.util.Scanner;
 
public class PowerRecursion
{
 public static void main(String args[])
 {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter number: ");
     int base=sc.nextInt();
     System.out.print("Enter exponent: ");
     int exponent=sc.nextInt();
     System.out.print("Power of "+base+"^"+exponent+" = "+power(base,exponent));
 }
 
 static int power(int b,int e)
 {
 if(e==0)
 {
     return 1; 
 }

 else 
 {
     return (b*power(b,e-1)); 
 }

 }
}