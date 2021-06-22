// 8. Write a Java program to find the duplicate values of an array of integer values?
// Code:

import java.util.Scanner;

public class ArrDuplicate {

	public static void main(String[] args) {
	
		System.out.print("Enter the length of array: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.print("Enter the elements of array: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
			for(int j=i+1;j<arr.length;j++)
				if(arr[i]==arr[j])
					System.out.println(arr[j]+" is the duplicate value in the array.");
		sc.close();
	}


}