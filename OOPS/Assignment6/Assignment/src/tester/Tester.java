package tester;

import java.util.Scanner;

import stack.Employee;
import stack.FixedStack;
import stack.GrowableStack;
import stack.Stack;

public class Tester {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Stack stack = null;
		int ch = 5;
		do {
			System.out.println("1. Fixed stack");
			System.out.println("2. Growable stack");
			System.out.println("3. Push data");
			System.out.println("4. Pop data and display");
			System.out.println("5. Exit");
			System.out.println("Enter your choice:");
			ch = in.nextInt();
			in.nextLine();
			switch (ch) {
			case 1:
				if (stack == null)
					stack = new FixedStack();
				else
					System.out.println("Stack is already chosen!");
				break;
			case 2:
				if (stack == null)
					stack = new GrowableStack();
				else
					System.out.println("Stack is already chosen!");
				break;
			case 3:
				System.out.println("Enter employee details (int id, String name, double salary)");
				Employee e = new Employee(in.nextInt(), in.next(), in.nextDouble());
				stack.push(e);
				break;
			case 4:
				Employee emp = stack.pop();
				if (emp != null)
					System.out.println(emp.toString());
				else
					System.out.println("Stack is empty!");
				break;
			case 5:
				System.out.println("Exit");
				in.close();
				return;
			default:
				System.out.println("Wrong choice! Exited");
				in.close();
				return;
			}
		} while (ch != 5);
		in.close();
}
}