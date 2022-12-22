package threads_c;

import java.util.ArrayList;
import java.util.List;

public class Stack {
	
	private List<Integer> list = new ArrayList<>();
	public static final int MAX = 10;

	
	
	
	/**waits until the list is not full, then adds the val to it;
	 * @param val
	 */
	public synchronized void push(int val) {
		
		while (list.size() == MAX) {
			
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		list.add(val);
		System.out.println(Thread.currentThread().getName() + " produced: " + val);
		System.out.println(list);
		notify();
	}

	
	
	
	/** waits until the list is not empty, then remove the last
	 * value from it and returns it.
	 * @return
	 */
	public synchronized int pop() {
		
		while (list.isEmpty()) {
			
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		notify();
		int val = list.get(list.size() - 1);
		System.out.println(Thread.currentThread().getName() + " consumed: " + val);
		list.remove(list.size() - 1);
		System.out.println(list);
		
		return val;
	}

}
