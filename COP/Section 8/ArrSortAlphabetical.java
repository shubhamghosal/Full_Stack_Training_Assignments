// 12. Write a program to Sort strings in alphabetical order?
// Code:


import java.util.Arrays;
import java.util.Scanner;

public class ArrSortAlphabetical {

	public static void main(String[] args) {
		System.out.println("Enter the length of array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String str[]=new String[n];
		System.out.println("Enter the strings in array");
		for(int i=0;i<str.length;i++)
		{
			str[i]=sc.next();
		}
		Arrays.sort(str);
	
		for(int i=0;i<str.length;i++)
		{
		System.out.println(str[i]);
    	}
}
}