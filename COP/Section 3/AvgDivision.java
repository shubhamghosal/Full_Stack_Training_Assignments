// 16. Write a java program to ask user to enter test marks of three subjects such as Phy, Chem, Math. Max marks for each subject is 100. Now calculate average of marks. Display following message based on average marks calculated - 

// avg < 30 : You are failed.
// avg >= 30 but < 60 : You passed with Second division
// avg >=60 but < 80 : You passed wirh Fiear division
// avg>=80 : You passed with First class distinction

// Code:

import java.util.Scanner;

public class AvgDivision {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Input the marks of Physics, Chemistry and Maths (out of 100): ");
    int phy = sc.nextInt();
    int chem = sc.nextInt();
    int maths = sc.nextInt();
    int total = phy + chem + maths;
    double avg = total/3;
    
    if(phy>100 || chem>100 || maths>100 || avg>100)
    {
    	System.out.println("Invalid Input...");
    }
    else if(avg>=80 && avg<=100)
    {
    	System.out.println("Average = "+avg);
        System.out.println("You passed with First class distinction.");
    }
    else if(avg>=60 && avg<80)
    {
    	System.out.println("Average = "+avg);
    	 System.out.println("You passed with First division");
    }
    else if(avg>=30 && avg<60)
    {
    	System.out.println("Average = "+avg);
    	 System.out.println("You passed with Second division.");
    }
    else
    {
    	System.out.println("Average = "+avg);
    	System.out.println("You are failed.");
    }
   
    sc.close();
  }
}