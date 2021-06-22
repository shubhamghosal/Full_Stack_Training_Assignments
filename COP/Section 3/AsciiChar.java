// 13. Write a Java program to print the ascii value of a given character?

// Code:

import java.util.Scanner;

public class AsciiChar
{  
public static void main(String[] String)   
{  
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the character: ");  
	char ch = sc.next().charAt(0);
	int as = (int) ch;
	
System.out.println("The ASCII value of " +ch +" is " +as);  
sc.close();
}
}