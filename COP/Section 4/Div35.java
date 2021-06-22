// 19. Write a program to print all numbers between 1 & 100 which are divisible by 3 and 5 both?

// Code:

public class Div35
{
    public static void main(String args[]) 
    {
		System.out.println("Numbers divisible by 3 & 5 both are: ");			
		for (int i=1; i<=100; i++) 
		{
			if (i%3==0 && i%5==0) 
			{
				System.out.print(i +" ");	
			}		
		}
		System.out.println("\n");
  }
}