// 11. Write a program to Sort an array in ascending order? [Notes : Arrays.sort()]
// Code:

import java.util.Arrays;
import java.util.Scanner;

public class ArrSort {

	public static void main(String[] args) {
		
		System.out.println("enter the length of array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the elements of array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("after sorting "+Arrays.toString(arr));
	}

}