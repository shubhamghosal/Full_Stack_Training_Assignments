package runnable_tasks;

import utils.JointAccount;
import static java.lang.Thread.*;

public class CheckerTask implements Runnable {
	// state : D.M
	private JointAccount jointAccount;

	public CheckerTask(JointAccount jointAccount) {
		super();
		this.jointAccount =jointAccount;//new JointAccount(34567);// 
	}

	@Override
	public void run() {

		System.out.println(currentThread().getName() + " strted");// even
		try {
			while (true) {
				// invoke check method on the joint a/c
				double balance = jointAccount.checkBalance();
				System.out.println("curnt bal " + balance);
				if (balance != 5000) {
					System.out.println("ERROR!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
					System.exit(1);
				}
			}
		} catch (Exception e) {
			System.out.println(currentThread().getName() + "got err " + e);
		}
		System.out.println(currentThread().getName() + " over");

	}

}
