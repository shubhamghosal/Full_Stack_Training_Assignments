// 6. Write a Java program to test if an array contains a specific value?
// Code:

import java.util.Scanner;

public class ArrSpecificVal {

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
		System.out.print("Enter the element you  want to search: ");
		int x=sc.nextInt();
		int i;
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]==x)
			{
				System.out.println(x+ " is present at index no."+i);
			break;
			}
		}
		if(i==arr.length) {
			System.out.println(x+ " is not present");
		}
			
		sc.close();
	}

}