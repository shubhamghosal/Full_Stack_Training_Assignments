// 1. Write a program to calculate average of numbers stored in an array?
// Code:

import java.util.Scanner;

public class ArrAvg {
public static void main(String[] args) {
	double avg, total=0;
	System.out.print("Enter the length of array: ");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int[n];
	System.out.print("Enter the elements: ");
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
	}
	for(int i=0;i<arr.length;i++)
	{
		total=total+arr[i];
	}
		avg=total/n;
		System.out.println("Average = "+avg);
		sc.close();
	}
}