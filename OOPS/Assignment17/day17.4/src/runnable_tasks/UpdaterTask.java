package runnable_tasks;

import utils.JointAccount;
import static java.lang.Thread.*;

public class UpdaterTask implements Runnable {
	// state : D.M
	private JointAccount jointAccount;

	public UpdaterTask(JointAccount jointAccount) {
		super();
		this.jointAccount = jointAccount;
	}

	@Override
	public void run() {

		System.out.println(currentThread().getName() + " strted");// even
		try {
			while(true)
			{
				//invoke update method on the joint a/c
				synchronized (jointAccount) {
					jointAccount.updateBalance(500);
				}				
				Thread.sleep(10);
			}
		} catch (Exception e) {
			System.out.println(currentThread().getName() + "got err " + e);
		}
		System.out.println(currentThread().getName() + " over");

	}

}
