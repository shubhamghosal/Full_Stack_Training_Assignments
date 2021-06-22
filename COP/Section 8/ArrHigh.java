// 3. Write a program to find out highest and second highest number in an array?
// Code:

import java.util.Scanner;

public class ArrHigh {

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
		int max=0,smax=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				smax=max;
				max=arr[i];
			}
			else if(arr[i]<max && arr[i]>smax)
				smax=arr[i];
		}
		System.out.println("The highest number is "+max+" and the second highest number is "+smax);
		sc.close();
	}

}