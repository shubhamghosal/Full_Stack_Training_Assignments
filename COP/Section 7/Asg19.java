// 1.1) Write test class named as NumUtilMain to test all these methods.
//  1.2) Extends question 2.1 to make it menu driven, based on the user choice , read relevant data from user and call static methods.

// Code:

import java.util.Scanner;

public class Asg19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("1.For factorial press 1\n2.For power press 2\n3.For checking even press 3\n4.For checking odd press 4");
        System.out.print("Enter your choice: ");
        int choice=sc.nextInt();
        switch (choice)
        {
            case 1:{
                System.out.print("Enter number: ");
                num= sc.nextInt();
                System.out.println("Factorial is "+NumUtil.getFactorial(num));
                break;
            }
            case 2:{
                System.out.print("Enter number: ");
                num= sc.nextInt();
                System.out.print("Enter power: ");
                double x= sc.nextDouble();
                System.out.println("Power is "+NumUtil.getPower(x,num));
                break;
            }
            case 3:{
                System.out.println("Enter number: ");
                num= sc.nextInt();
                if (NumUtil.isEven(num))
                    System.out.println(num+" is even");
                else System.out.println(num+" is not even");
                break;
            }
            case 4:{
                System.out.println("Enter number: ");
                num= sc.nextInt();
                if (NumUtil.isOdd(num))
                    System.out.println(num+" is odd");
                else System.out.println(num+" is not odd");
                break;
            }
            default:
                System.out.println("Invalid input");
                break;
        }
        sc.close();
    }
}

class NumUtil {

    static double getPower(double x, int num)
    {
        int result=num;
        for (int i=0;i<x-1;i++)
        {
            result=result*num;
        }
        return result;
    }
    static long getFactorial(int num)
    {
        int factorial=num;
       for (int i=1;i<num;i++)
       {
           factorial=factorial*(num-i);
       }
       return factorial;
    }
    static boolean isPrime(int num)
    {
        for (int i=2;i<num;i++)
            if (num%i==0)
                return false;

            return true;
    }
    static boolean isEven(int num)
    {
        if (num%2==0)
            return true;
        return false;
    }
    static boolean isOdd(int num)
    {

        if (num%2!=0)
            return true;
        return false;
    }


}