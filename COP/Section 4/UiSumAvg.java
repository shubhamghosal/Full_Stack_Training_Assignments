// 2. Write a java program to read 10 numbers from keyboard and find their  sum and average?

// Code:

import java.util.Scanner;

public class UiSumAvg
{  
public static void main(String[] args)   
{  
int sum = 0;  
System.out.print("Enter 10 numbers: ");
Scanner sc = new Scanner(System.in);

for(int i = 1; i <= 10; ++i)  
{
 int num = sc.nextInt();
 sum = sum + num;
}   
double avg = sum/10d;
System.out.println("Sum of the input 10 numbers is = " + sum);  
System.out.println("Average of the 10 numbers is = " + avg);
sc.close();
}  
}  