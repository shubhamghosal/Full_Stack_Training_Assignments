package tester;

import java.util.Scanner;

import runnable_tasks.EvenPrinterTask;
import runnable_tasks.OddPrinterTask;

public class TestThreads {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter start n end ");
			int start = sc.nextInt();
			int end = sc.nextInt();
			// create thread by attaching runnable task instance n start the same
			// Constr : Thread(Runnable instance,String name)
			Thread t1 = new Thread(new EvenPrinterTask(start, end), "even");// t1 : NEW
			Thread t2 = new Thread(new OddPrinterTask(start, end), "odd");// t2: NEW
			t1.start();
			t2.start();// t1,t2 : RUNNABLE
			System.out.println("main waiting for child thrds to complete exec");
			t1.join();// main waiting for t1
			t2.join();// main waiting for t2
			System.out.println(t1.isAlive() + " " + t2.isAlive());//false
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over....");

	}

}
