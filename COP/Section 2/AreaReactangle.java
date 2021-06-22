// 5. Write a Java program to print the area and perimeter of a rectangle. Take required input using Scanner?

// Hint : 
// Area = width * height
// Perimeter = 2 * ( width + height)

// Code:

import java.util.Scanner;

public class AreaReactangle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the width: ");
		double width = sc.nextDouble();
		System.out.print("Enter the height: ");
		double height = sc.nextDouble();

		double area = width * height;
		double perimeter = 2 * (width + height);

		System.out.println("The area of the rectangle is " + area);
		System.out.println("The perimeter of the rectangle is " + perimeter);
		sc.close();
	}

}