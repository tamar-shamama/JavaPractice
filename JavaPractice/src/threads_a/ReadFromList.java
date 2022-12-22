package threads_a;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ReadFromList extends Thread {
	
	public static List<Integer> list = new ArrayList<Integer>();
	
	// create a situation when one thread changes the list after
	// the other thread already checked it, but before doing something
	// to it - leading to exception
	
	// fix it
	
	
	@Override
	public void run() {
		
		System.out.println("from " + this.getName() + " : " + "start");
		
		synchronized (list) {
			
		    // get the last index before it is deleted
			int index = list.size()-1;
			
			try {
				TimeUnit.SECONDS.sleep(3);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			// trying to pring un existing value
			System.out.println(list.get(index));
			
		}
		
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("from main thread: start");
		ReadFromList thread = new ReadFromList();
		
		list.add(5);
		list.add(2);
		list.add(7);
		
		thread.start();
		
		Thread.sleep(1500);
		
		synchronized (list) {
			list.remove(list.size()-1);
		}
		System.out.println(list.get(list.size()-1));
		
	}
	
	

}
