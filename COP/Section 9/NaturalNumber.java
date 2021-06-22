// 1. Write a java program to print first 10 natural number using recursion?

// Code:

public class NaturalNumber {
	static void PrintNaturalNumber(int n)
	{
	    if(n<=10)
	    {
	    	 System.out.print(" "+n+" ");
	    	 PrintNaturalNumber(n+1);
	    }
	}
	public static void main(String[] args) {
		 int n=1;
		 System.out.println("First 10 Natural Numbers are:");
		    PrintNaturalNumber(n);
		}
	}