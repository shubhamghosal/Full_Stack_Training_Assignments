package utils;

import static java.lang.Thread.*;

public class JointAccount {
	private double balance;

	public JointAccount(double balance) {
		super();
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "BankAccount [balance=" + balance + "]";
	}

	// update balance
	public   void updateBalance(double amt) throws Exception {
		//bal : 5000
		System.out.println("Updating bal : " + currentThread().getName());
		balance = balance + amt;//5500
		System.out.println("Cancelling updates, after a dly");
		Thread.sleep(20);//think time of a user !
		balance = balance - amt;//bal : 5000
		System.out.println("Updations over by " + currentThread().getName());
	}//5000

	// chk balance
	public   double checkBalance() throws Exception {
		System.out.println("Checking balance : by "+ currentThread().getName());
		Thread.sleep(37);
		return balance;

	}

}
