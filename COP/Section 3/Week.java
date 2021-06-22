// 17. Write a java program to ask user to enter a number between 1 and 7, print week day as per below mappings - 
//  (1 - Monday, 2-Tuesday, .... 7-Sunday)

// Code:

import java.util.Scanner;

public class Week {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number between 1 and 7: ");
    int num = sc.nextInt();
    
    switch(num)
    {
    	case 1:
    		System.out.println("1 - Monday");
    		break;
    	case 2:
    		System.out.println("2 - Tuesday");
    		break;
    	case 3:
    		System.out.println("3 - Wednesday");
    		break;
    	case 4:
    		System.out.println("4 - Thursay");
    		break;
    	case 5:
    		System.out.println("5 - Friday");
    		break;
    	case 6:
    		System.out.println("6 - Saturday");
    		break;
    	case 7:
    		System.out.println("7 - Sunday");
    		break;
    }
    sc.close();
  }
}