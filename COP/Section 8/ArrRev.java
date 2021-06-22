// 2. Write a program to reverse an array of elements?
// Code:

import java.util.Scanner;

public class ArrRev {

	public static void main(String[] args) {
		System.out.print("Enter the length of array: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements of array: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Before reverse: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int i=0,j=arr.length-1;
		int temp=0;
		while(i<j)
		{
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		i=0;
		System.out.println("After reverse: ");
		for(i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		sc.close();
	}

}