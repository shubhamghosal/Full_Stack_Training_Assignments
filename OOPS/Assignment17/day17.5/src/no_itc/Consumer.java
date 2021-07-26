package no_itc;

public class Consumer implements Runnable {
	private Utils2 u;
	private boolean exit;
	public Consumer(Utils2 u) {
		this.u=u;
	}

	@Override
	public void run() {
		System.out.println("started thrd  -- "
				+ Thread.currentThread().getName());
		try {
		
			while (!exit) {
			//	System.out.println("Read Data "+u.readData());
				u.readData();
				Thread.sleep(40);
			}
		} catch (Exception e) {
			System.out.println("err in " + Thread.currentThread().getName()
					+ "  " + e);
		}
		System.out.println("thrd over -- " + Thread.currentThread().getName());

	}
	public void stop()
	{
		exit=true;
	}

}
