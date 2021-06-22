// 9. Write a Java program to find the common elements between two arrays of integers?
// Code:

import java.util.Scanner;

public class ArrCommon {

	public static void main(String[] args) {


		System.out.print("Enter the length of array 1: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.print("Enter the elements of array 1: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter the length of array 2: ");
		int m=sc.nextInt();
		int arr2[]=new int[m];
		System.out.print("Enter the elements of array 2: ");
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++)
			for(int j=0;j<arr2.length;j++)
				if(arr[i]==arr2[j])
					System.out.println(arr2[j]+" is duplicate value ");
		sc.close();

	}

}