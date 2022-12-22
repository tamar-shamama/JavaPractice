package threads_b;

public class Driver extends Thread {
		
		private Car car;
		
		public Driver (String name, Car car) {
			super(name);
			this.car = car;
		}
		
		@Override
		public void run() {
			car.drive(500);
		}
		


}