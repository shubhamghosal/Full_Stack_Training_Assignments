// 18. Write a program to find the length of a string without using the library function?

// Code:

import java.util.Scanner;
 
public class StrLen {
	  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
	    String str = sc.nextLine();
	    int num = strLength(str);
	    System.out.println("Length of the String is " + num);
	    sc.close();
	  }
	  private static int strLength(String str)
	  {
	    int count = str.lastIndexOf("");
	    return count;
	  }
	}