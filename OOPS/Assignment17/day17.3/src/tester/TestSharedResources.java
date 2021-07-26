package tester;

import runnable_tasks.CheckerTask;
import runnable_tasks.UpdaterTask;
import utils.JointAccount;

public class TestSharedResources {

	public static void main(String[] args) {
		try {
			// create SINGLE joint a/c instance
			JointAccount acct = new JointAccount(5000);
			// create the tasks, attach thrds n start the same
			// Thread(Runnable instance,String name);
			Thread t1 = new Thread(new UpdaterTask(acct), "customer1");
			Thread t2 = new Thread(new CheckerTask(acct), "customer2");
			t1.start();
			t2.start();
			System.out.println("main waiting for child thrds to finish exec");
			t1.join();
			t2.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over....");

	}

}
