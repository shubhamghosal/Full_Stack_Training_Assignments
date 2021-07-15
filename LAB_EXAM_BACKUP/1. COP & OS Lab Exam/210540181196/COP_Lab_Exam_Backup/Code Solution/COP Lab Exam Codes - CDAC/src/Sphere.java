import java.util.Scanner;

public class Sphere {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter the radius of the sphere: ");
		double rad = in.nextDouble();

		Calculate obj = new Calculate(rad);
		obj.Volume();
		obj.surfaceArea();

		in.close();
	}

}

class Calculate {
	double radius;

// Using constructor Calculate to set radius
	public Calculate(double r) {

		radius = r;
	}

// Calculating volume of sphere
	void Volume() {
		double vol = ((double) 4 / (double) 3) * (Math.PI * radius * radius * radius);
		System.out.println("Volume Of the Sphere :" + vol);
	}

// Calculating surface area of sphere
	void surfaceArea() {
		double sur = 4 * Math.PI * radius * radius;
		System.out.println("Surface Area Of the Sphere :" + sur);
	}

}
