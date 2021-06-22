// 6. Write a program to display the pattern like right angle triangle with a number as shown below : 
// 1
// 12
// 123
// 1234

// Code:


import java.util.Scanner;



public class Pat2
{
    public static void printNums(int n) 
    { 
        int i, j,num; 
    
        for(i=0; i<n; i++) 
        { 
            num=1; 
            for(j=0; j<=i; j++) 
            { 
                System.out.print(num); 
                num++; 
            } 
            System.out.println(); 
        } 
    } 
       public static void main(String args[]) 
    { 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows");
        int n = sc.nextInt(); 
        printNums(n); 
        sc.close();
    } 
}