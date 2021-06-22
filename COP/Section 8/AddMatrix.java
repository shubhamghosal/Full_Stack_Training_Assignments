// 10. Write a program to add two matrix of numbers?
// Code:

import java.util.Scanner;

public class AddMatrix {

	public static void main(String[] args) {
		System.out.println("Enter the rows size of matrix: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter the columns size of matrix: ");
		int m=sc.nextInt();
		int arr[][]=new int[n][m];
		System.out.println("Enter the elements of matrix");
		for(int i=0;i<arr.length;i++)
			for(int j=0;j<arr[i].length;j++)
		{
			arr[i][j]=sc.nextInt();
		}
		System.out.println("matrix 1 is ");
		for(int i=0;i<arr.length;i++)
		{	for(int j=0;j<arr[i].length;j++)
		{
			System.out.print(arr[i][j]+" ");		
		}
		System.out.println();
		}
		int arr2[][]=new int[n][m];
		System.out.println("enter the elements of matrix");
		for(int i=0;i<arr.length;i++)
			for(int j=0;j<arr[i].length;j++)
		{
			arr2[i][j]=sc.nextInt();
		}
		System.out.println("matrix 2 is ");
		for(int i=0;i<arr2.length;i++)
		{	for(int j=0;j<arr2[i].length;j++)
		{
			System.out.print(arr2[i][j]+" ");		
		}
		System.out.println();
		}	
		int arr3[][]=new int[n][m];
    	for(int i=0;i<arr3.length;i++)
			for(int j=0;j<arr3[i].length;j++)
		{
			arr3[i][j]=arr[i][j]+arr2[i][j];
		}
		System.out.println("matrix addition is ");
		for(int i=0;i<arr3.length;i++)
		{
		for(int j=0;j<arr3[i].length;j++)
		{
			System.out.print(arr3[i][j]+" ");		
		}
		System.out.println();
		}
		sc.close();
		
	}
}