// 9. Write a program to find the largest of three numbers?

 import java.util.Scanner;

public class LargeThree
{
    public static void main(String args[])
    {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter Three Numbers : ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
		
        if(a>b && a>c)
        {
            System.out.print("Largest of the Three Numbers is " +a);
        }
        else if(b>c && b>a)
        {
            System.out.print("Largest of the Three Numbers is " +b);
        }
        else
        {
            System.out.print("Largest of the Three Numbers is " +c);
        }
	
        sc.close();
    }
}