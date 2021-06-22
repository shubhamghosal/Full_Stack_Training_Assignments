// 10. Write a program to make such a pattern like a pyramid with a number which will repeat the number in the same row as shown below : 
//    1
//   2 2
//  3 3 3
// 4 4 4 4

// Code:

import java.util.Scanner;
 
public class Pat6
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Rows: ");
 
        int noOfRows = sc.nextInt();
        int rowCount = 1;
        for (int i = noOfRows; i > 0; i--)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= rowCount; j++)
            {
                System.out.print(rowCount+" ");
            }
            System.out.println();
            rowCount++;
        }
        sc.close();
    }
}