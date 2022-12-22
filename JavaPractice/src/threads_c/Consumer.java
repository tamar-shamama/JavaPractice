package threads_c;

public class Consumer extends Thread{
	
	private Stack stack;

	public Consumer(String name, Stack stack) {
		super(name);
		this.stack = stack;
	}

	@Override
	public void run() {
		
		int i = 0;
		
		while (i < 100) {
			
			i++;
			int x = stack.pop();
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}


}
