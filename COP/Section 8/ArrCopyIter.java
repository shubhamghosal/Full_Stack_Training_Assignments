// 4. Write a Java program to copy an array to another by iterating the array?
// Code:

import java.util.Scanner;

public class ArrCopyIter {

	public static void main(String[] args) {
		System.out.print("Enter the length of array: ");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.print("Enter the elements of array: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int j=0;
		int arr2[]=new int [n];
		for(int i=0;i<arr.length;i++)
		{
			arr2[j]=arr[i];
			j++;
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("After Iterating to new array: "+arr2[i]);
		}
		sc.close();
	}

}