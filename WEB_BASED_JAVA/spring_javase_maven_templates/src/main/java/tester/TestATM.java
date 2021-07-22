package tester;

import dependent.ATMImpl;

public class TestATM {

	public static void main(String[] args) {
		//dependent obj
		ATMImpl atm=new ATMImpl();
		atm.deposit(5000);//B.L invocation
		System.out.println("main over...");

	}

}
