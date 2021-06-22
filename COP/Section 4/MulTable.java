// 3. Write a program in java to display the multiplication table of a given integer?
// >> Enter the number : 5
// 5 X 1 = 5
// 5 X 2 = 10
// .
// .
// 5 X 10 = 50

// Code:

import java.util.Scanner;

public class MulTable
{  
public static void main(String[] args)   
{  
System.out.print("Enter the number to display table: ");
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();

for(int i = 1; i <= 10; ++i)  
{
 int mul = num*i;
 System.out.println(num +" x " + i +" = " +mul); 
}   
sc.close();
}  
}  