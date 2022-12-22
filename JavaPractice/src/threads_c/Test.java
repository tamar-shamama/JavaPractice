package threads_c;

public class Test {

	public static void main(String[] args) {
		
		Stack stack = new Stack();
		
		Producer producer1 = new Producer("producer-1", stack);
		Producer producer2 = new Producer("producer-2", stack);
		
		Consumer consumer1 = new Consumer("consumer-1", stack);
		Consumer consumer2 = new Consumer("consumer-1", stack);
		
		producer1.start();
		producer2.start();
		
		consumer1.start();
		consumer2.start();

	}

}
