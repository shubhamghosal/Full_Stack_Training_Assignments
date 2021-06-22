// 1. Write a java class named as NumUtil with following static methods to - 
//  double getPower(double x, int n)
//  long getFactorial(int num);
//  boolean isPrime(int num);
//  boolean isEven(int num);
//  boolean isOdd(int num);

// Code:

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