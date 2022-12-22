package threads_b;

public class TestCar {
	
public static void main(String[] args) {
		
		Car car1 = new Car();
		Car car2 = new Car();
		
		Driver driver1 = new Driver("dana", car1);
		Driver driver2 = new Driver("yosi", car1);
		Driver driver3 = new Driver("ruti", car2);
		
		driver1.start();
		driver2.start();
		driver3.start();
		

	}

}
