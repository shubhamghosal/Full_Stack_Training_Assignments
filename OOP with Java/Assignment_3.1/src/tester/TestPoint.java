package tester;

import java.util.Scanner;

import com.geometry.Point2D;

public class TestPoint {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the co-ordinates x & y dimension of the 1st point: ");
        Point2D p1 = new Point2D(in.nextDouble(), in.nextDouble());
        System.out.println("Enter the co-ordinates x & y dimension of the 2nd point: ");
        Point2D p2 = new Point2D(in.nextDouble(), in.nextDouble());

        System.out.println("1st Point Details are: " + p1.getDetails() + "\n" + "2nd Point Details are: " + p2.getDetails());

        System.out.println(p1.isEqual(p2) ? "POINTS ARE SAME" : "POINTS ARE DIFFERENT");

        System.out.println("3rd Point as created offset from 1st point details are: " + p1.newPoint());

        in.close();
    }
}
