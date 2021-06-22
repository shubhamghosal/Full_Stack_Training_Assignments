package com.geometry;

public class Point2D {
	double x, y;

	public Point2D(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public String getDetails() {

		return x + ", " + y;
	}

	public boolean isEqual(Point2D p2) {
		return this.x == p2.x && this.y == p2.y;
	}

	public String newPoint() {
		x = x + 1;
		y = y + 1;
		return x + ", " + y;
	}
}
