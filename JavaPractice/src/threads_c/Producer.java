package threads_c;
public class Producer extends Thread {
	
	private Stack stack;

	public Producer(String name, Stack stack) {
		super(name);
		this.stack = stack;
	}

	@Override
	public void run() {
		
		int i = 0;
		
		while ( i < 100) {
			
			i++;
			int x = (int) (Math.random() * 101);
			stack.push(x);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
			
	}

}
