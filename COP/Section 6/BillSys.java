// 3. Write a menu driven billing system for a Snacks center, items available are Tea(Rs. 10), Samosa (Rs. 20), Sandwitch(Rs. 50), Green Tea (Rs. 15) etc. as follows - 

// ****Welcome to Snack Center *********
// 1. Tea (Rs. 10)
// 2. Green Tea (Rs. 15)
// 3. Samosa (Rs. 20)
// 4. Sandwitch (Rs. 50)
// 5. Generate Bill & Exit
// Enter your choice : 1
//    Enter quantity : 2
   
// 1. Tea (Rs. 10)
// 2. Green Tea (Rs. 15)
// 3. Samosa (Rs. 20)
// 4. Sandwitch (Rs. 50)
// 5. Generate Bill & Exit
// Enter your choice : 3
//   Enter quantity : 3
  
// 1. Tea (Rs. 10)
// 2. Green Tea (Rs. 15)
// 3. Samosa (Rs. 20)
// 4. Sandwitch (Rs. 50)
// 5. Generate Bill & Exit
// Enter your choice : 5

//  *****BILL****
//  Tea    2    20
//  Samosa 3    60
//  ------------
//  Total = 80


// Code:

import java.util.Scanner;

public class BillSys 
{

	public static void main(String[] args) 
	{
		int tea=0,gtea=0, sam=0, sand=0;
		BillSys obj = new BillSys();
		obj.displayMenu(tea, gtea, sam, sand);
	}
	
	void displayMenu(int tea, int gtea, int sam, int sand) 
	{
		System.out.println("****Welcome to Snack Center ******");
		System.out.println("1. Tea (Rs. 10)");
		System.out.println("2. Green Tea (Rs. 15)");
		System.out.println("3. Samosa (Rs. 20)");
		System.out.println("4. Sandwitch (Rs. 50)");
		System.out.println("5. Generate Bill & Exit");
		System.out.print("Enter your choice : ");
		Scanner in = new Scanner(System.in);
		int choice = in.nextInt();
		if(choice != 5) 
		{
			System.out.print("Enter quantity : ");
			Scanner sc = new Scanner(System.in);
			int quantity = sc.nextInt();
			System.out.println();
			if(choice == 1)
			{
				tea = tea + (quantity * 10);
			}
			else if(choice == 2)
			{
				gtea = gtea + (quantity * 15);
			}
			else if(choice == 3)
			{
				sam = sam + (quantity * 20);
			}
			else if(choice == 4)
			{
				sand = sand + (quantity * 50);
			}
			displayMenu(tea, gtea, sam, sand);
			sc.close();
		}
		else if(choice == 5) 
		{
			displayResult(tea, gtea, sam, sand);
		}
		in.close();
	}
	
	void displayResult(int tea, int gtea, int sam, int sand)
	{
		System.out.println();
		System.out.println("****** BILL ******"); 
		if(tea != 0) {
			System.out.println("Tea        " + tea/10 + "  " + tea);
		}
		if(gtea != 0) {
			System.out.println("Green Tea  " + gtea/15 + "  " + gtea);
		}
		if(sam != 0) {
			System.out.println("Samosa     "  + sam/20 + "  " + sam);
		}
		if(sand != 0) {
			System.out.println("Sandwitch  " + sand/50 + "  " + sand);
		}
		System.out.println("-------------------");
		int total = tea + gtea + sam + sand;
		System.out.println("   Total = "+ total);
		
	}
}