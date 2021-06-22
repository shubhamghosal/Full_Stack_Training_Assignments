// 5. Write a program to concatenate two arrays (merge two array to new one)?
//    	a[] = {1,2,3}
// 	b[] = {4,5}
// 	c[] = {1,2,3,4,5}
// Code:

import java.util.Scanner;

public class ArrConcat {

	public static void main(String[] args) {
		System.out.print("Enter the length of 1st array: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.print("Enter the elements of 1st array: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter the length of 2nd array: ");
		int m=sc.nextInt();
		int arr2[]=new int[m];
		System.out.print("Enter the elements of 2nd array: ");
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i]=sc.nextInt();
		}
		int p=arr.length+arr2.length;
		int arr3[]=new int[p];	
		for(int i=0;i<arr.length;i++)
			{
				arr3[i]=arr[i];
			}
		int j=0;
		for(int i=arr.length;i<arr3.length;i++)
			{
				arr3[i]=arr2[j];
				j++;
			}
		System.out.print("Concatenation of 1st & 2nd array is");
		for(int i=0;i<arr3.length;i++)
		{
			System.out.print(" "+arr3[i]);
		}	
		sc.close();
	}

}