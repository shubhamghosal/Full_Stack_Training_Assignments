// 7. Write a java program to calculate compound interest, get the required inputs 
// using Scanner ?

// Code:

import java.util.Scanner;

public class CompoundInterest {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter the principal: ");
    double principal = input.nextDouble();

    System.out.print("Enter the rate: ");
    double rate = input.nextDouble();

    System.out.print("Enter the time: ");
    double time = input.nextDouble();

    System.out.print("Enter number of times interest is compounded anually: ");
    int number = input.nextInt();

    double interest = principal * (Math.pow((1 + rate/(number*100)), (time * number))) - principal;

    System.out.println("The Compound Interest is " + interest);

    input.close();
  }
}