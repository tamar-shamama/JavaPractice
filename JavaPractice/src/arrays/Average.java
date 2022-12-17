package arrays;

import java.util.Arrays;
import java.util.Iterator;

public class Average {

	public static void main(String[] args) {
		
		// calculate the average value;
		
		int[] arr = { 5, 9, 98, 0, 11, 3};
		
		
		// sol 1 - loop
		int avg1 = average_1(arr);
		System.out.println(avg1);

		// sol 2 - stream
		int avg12 = average_2(arr);
		System.out.println(avg1);
	}


	private static int average_1(int[] arr) {
		
		int avg = 0;
		int counter = 0;
		
		for (int i = 0; i < arr.length; i++) {
			counter++;
			avg += arr[i];
		}
		avg = avg/counter;
		return avg;
	}

	
	private static int average_2(int[] arr) {
		
		double double_avg = Arrays.stream(arr).average().getAsDouble();
		int avg = (int) double_avg;
		return avg;
	}
}
