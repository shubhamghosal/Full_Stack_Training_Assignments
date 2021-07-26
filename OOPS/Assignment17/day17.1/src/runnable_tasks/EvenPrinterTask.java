package runnable_tasks;

import static java.lang.Thread.*;

import java.util.Random;

public class EvenPrinterTask implements Runnable {
	private int start;
	private int end;
	private Random r1;// null

	public EvenPrinterTask(int start, int end) {
		super();
		this.start = start;
		this.end = end;
		r1 = new Random();//creating instance of random no generator
		System.out.println("constr invoked by " + currentThread().getName());// main
	}

	@Override
	public void run()/* throws InterruptedException */ {
		System.out.println(currentThread().getName() + " strted");// even
		try {
			for (int i = start; i <= end; i++) {
				if (i % 2 == 0)
					System.out.println("Even No " + i + " invoked by thrd " + currentThread().getName());
				// force ctx switching : sleep : randomize it ! 100 ----500msec :
				// r1.nextInt(499)+1
				sleep(r1.nextInt(401) + 100);
			}
		} catch (Exception e) {
			System.out.println(currentThread().getName() + "got err " + e);
		}
		System.out.println(currentThread().getName() + " over");

	}

}
