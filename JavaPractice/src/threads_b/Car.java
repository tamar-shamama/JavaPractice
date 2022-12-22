package threads_b;

import java.util.concurrent.TimeUnit;

public class Car {
	
	private int id;
	private int km;
	
	private static int c = 101;
	
	{
		this.id = c++;
	}
	
	public synchronized void drive (int distance) {
		
		System.out.println(Thread.currentThread().getName() + " drove off with car number " + id + ". started at " + km + ".");
		
		km += distance;
		
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " parked with car number " + id + ". finished at " + km + ". (drove " + distance + " .)");
	}
	
	

}
