package com.tester;

import java.util.Scanner;

import com.geometry.Point2D;

public class TestPointArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("How many points to plot?");

		Point2D[] points = new Point2D[in.nextInt()];

		while (true) {
			System.out.println("\n");
			System.out.println("1. Plot a new point.");
			System.out.println("2. Display all points plotted so far.");
			System.out.println("3. Test equality of 2 points.");
			System.out.println("4. Calculate distance.");
			System.out.println("10. Exit.");
			System.out.println("***Enter your choice***");

			int choice = in.nextInt();
			if (choice == 1) {
				System.out.println("Enter the index and the new point details: index x y");
				int index = in.nextInt();
				if (index >= 0 && index < points.length && points[index] == null) {
					points[index] = new Point2D(in.nextDouble(), in.nextDouble());
					System.out.println("New Point Plotted....");

				} else {
					System.out.println("Point Plotting Error....");
				}
			}

			else if (choice == 2) {
				for (Point2D p : points) {
					if (p != null) {
						System.out.println("Point Details: " + p.getDetails());
					} else {
						System.out.println("Error...");
					}

				}
			} else if (choice == 3) {
				System.out.println("Enter the two index to check equality of 2 points: index1 index2");
				int index1 = in.nextInt();
				int index2 = in.nextInt();
				if (index1 >= 0 && index1 < points.length && points[index1] != null && index2 >= 0
						&& index2 < points.length && points[index2] != null) {
					System.out.println(points[index1].isEqual(points[index2]) ? "POINTS ARE SAME" : "POINTS ARE DIFFERENT");
				} else {
					System.out.println("Error indexes...");
				}

			} else if (choice == 4) {
				System.out.println("Enter the two index to check distance between two points: index1 index2");
				
				int ind1 = in.nextInt();
				int ind2 = in.nextInt();
				double x1 = points[ind1].x;
				double y1 = points[ind1].y;
				double x2 = points[ind2].x;
				double y2 = points[ind2].y;
				System.out.println((Math.sqrt(Math.pow(x2 - x1, 2)+Math.pow(y2 - y1, 2) * 1.0)));

			} else if (choice == 10) {
				break;
			}
		}
		System.out.println("Job Completed.");
		in.close();
	}

}
