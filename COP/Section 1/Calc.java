// 10. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers received from command line?
// Code:

public class Calc {

	public static void main(String[] args) {
		double n1= Double.parseDouble(args[0]);
		double n2 = Double.parseDouble(args[1]);
        
		System.out.println("Sum of "+n1 +" and " +n2 +" is " +(n1+n2));
		System.out.println("Multiplication of "+n1 +" and " +n2 +" is " +(n1*n2));
		System.out.println("Division of "+n1 +" and " +n2 +" is " +(n1/n2));
		System.out.println("Remainder of "+n1 +" and " +n2 +" is " +(n1%n2));
	}

}