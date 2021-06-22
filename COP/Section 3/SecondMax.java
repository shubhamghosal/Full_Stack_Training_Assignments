// 20. Write a program to read 5 numbers from user, print the second highest number?

// Code:

import java.util.Scanner;

public class SecondMax
{
	public static void main(String[] arg)
	{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter 5 numbers : ");
	double n1 = sc.nextDouble();
	double n2 = sc.nextDouble();
	double n3 = sc.nextDouble();
	double n4 = sc.nextDouble();
	double n5 = sc.nextDouble();
	
	double secondMax = new SecondMaxFinder(n1, n2, n3, n4, n5).getSecondMax();
        System.out.println("The second highest number is "+secondMax);
        sc.close();
	
	}
}
class SecondMaxFinder 
{

	    private double greatest;
	    private double secondGreatest;

	    public SecondMaxFinder(double n1, double n2, double n3, double n4,double n5)
	    {
	        if (n1 > n2) 
	        {
	            greatest = n1;
	            secondGreatest = n2;
	        } 
	        else 
                {
	            greatest = n2;
	            secondGreatest = n1;
	        }
	        fitCandidateIn(n3);
	        fitCandidateIn(n4);
	        fitCandidateIn(n5);
	    }

	    private void fitCandidateIn(double n) 
            {
	        if (n > greatest) 
                {
	            secondGreatest = greatest;
	            greatest = n;
	        } 
                else if (n > secondGreatest) 
                {
	            secondGreatest = n;
	        }
	    }

	    public double getSecondMax() 
            {
	        return secondGreatest;
	    }

	}