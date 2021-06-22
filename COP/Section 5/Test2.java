// 2. Create a class Circle, it will have only one constructor which accepts radius as an argument. Write two methods in the class - calcuateArea(), calculatePermiter(). 
// Write test class to test method calls.

// class Circle{
//   int rad;
//   Circle(int r){this.rad = r;}
//   double calArea(){}
//   double calPerimeter(){}
// }

// Code:

import java.util.Scanner;

class Circle 
{
	int rad;
	Circle(int r) 
	{
		this.rad = r;
	}
	double calculateArea()
	{
		double Area = Math.PI * rad * rad;
		return Area;
	}
	double calculatePerimeter()
	{
		double Perimeter = 2 * Math.PI * rad;
		return Perimeter;
	}
}

public class Test2 
{
	public static void main(String[] args) 
	{
		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter the radius of circle: ");
		int radius = sc.nextInt();
	
		Circle c1 = new Circle(radius);
		
		System.out.println("Area is " +c1.calculateArea());
		System.out.println("Perimeter is " +c1.calculatePerimeter());
		
		sc.close();

	}

}