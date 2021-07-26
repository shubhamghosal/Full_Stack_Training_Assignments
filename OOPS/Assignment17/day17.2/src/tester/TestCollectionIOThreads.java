package tester;

import java.util.HashMap;
import java.util.Scanner;

import com.app.core.Student;

import runnable_tasks.DoBSorterTask;
import runnable_tasks.GPASorterTask;

import static utils.CollectionUtils.populateMap;

public class TestCollectionIOThreads {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			//get populated sample data 
			HashMap<String, Student> map = populateMap();
			System.out.println("Enter file name for DoB based sorting n GPA based sorting");
			//create thrds (by attaching tasks) n start them
			Thread t1=new Thread(new DoBSorterTask(map,sc.next()),"dob");
			Thread t2=new Thread(new GPASorterTask(map, sc.next()),"gpa");
			t1.start();
			t2.start();
			System.out.println("main waiting for child thrds.....");
			t1.join();
			t2.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over...");

	}

}
