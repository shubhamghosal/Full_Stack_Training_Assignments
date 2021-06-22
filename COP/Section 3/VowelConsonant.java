// 18. Write a Java program to check if character entered by user is a vowel, consonant or other character?

// Code:

import java.util.Scanner;

public class VowelConsonant
{
	public static void main(String[ ] arg)
	{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a character : ");
	char ch=sc.next( ).charAt(0);	 		
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
	{
	System.out.println("Entered character "+ch+" is a vowel"); 
	}
	else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
		System.out.println("Entered character "+ch+" is a consonant");
	      else
		System.out.println("Other than alphabet character entered.");	
		sc.close();	
	}
}