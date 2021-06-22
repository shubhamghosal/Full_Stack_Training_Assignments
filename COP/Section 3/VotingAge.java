// 6. Write a java program to read age of a person, check if he/she is eligible to cast vote or not?

// Code:

import java.util.Scanner;

public class VotingAge
{
    public static void main(String[] args)
    {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age= ");
        age = sc.nextInt();
        if (age >= 18)
        {
            System.out.println("You are eligible to vote.");
        }
        else
        {
            System.out.println("You are not eligible to vote.");
        }
        sc.close();
    }
}