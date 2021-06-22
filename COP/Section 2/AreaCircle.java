// 6. Write a Java program to print the area and perimeter of a circle. Take required input using Scanner?

// Hint : 
// Area = Math.PI * radius * radius
// Perimeter = 2* Math.PI* radius

// Code:

import java.util.Scanner;

public class AreaCircle{


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
		double radius = sc.nextDouble();
        
		double area = 3.14 * radius * radius;
		double perimeter = 2 * 3.14 * radius;
		
		System.out.println("The area of the circle is "+area);
		System.out.println("The perimeter of the circle is "+perimeter);
		sc.close();
	}

}