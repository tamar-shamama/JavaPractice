package arrays;

import java.util.Arrays;

public class SetClock {
	
	
	// question - rotate the arrays left a number of steps, the way you set
	//            the time in a clock.
	
	private static int hours[] = {1,2,3,4,5,6,7,8,9,10,11,12};
	private static int minutes[] = new int[60];
	
	private static int numOfStepsOnHoure = 3;
	private static int numOfStepsOnMinutes = 32;

	
	
	public static void main(String[] args) {
		
		
		// set array of minutes
		for (int i = 0; i < minutes.length; i++) {
			minutes[i] = i;
		}
		
		
		// print arrays
		System.out.print(Arrays.toString(hours));
		System.out.println();
		System.out.print(Arrays.toString(minutes));
		System.out.println("\n");
		

		
		// show current time on clock (first value on both arrays)
		whatTime();
		System.out.println();
		
		
		// move array of hours 3 steps
		setHoure();
		whatTime();
		System.out.println();
		
		
		// move array of minutes 32 steps
		setMinute();
		whatTime();
		System.out.println();
		
	}

	

	private static void whatTime() {
		
		StringBuilder stringBuilder = new StringBuilder();
		handlePreZero(hours[0], stringBuilder);
		stringBuilder.append(" : ");
		handlePreZero(minutes[0], stringBuilder);
		System.out.println(stringBuilder.toString());
	}
	

	private static void handlePreZero(int number, StringBuilder stringBuilder) {
		
		if (number < 10) {
			stringBuilder.append("0" + number);
		} else {
			stringBuilder.append(number);
		}
	}
	
	

	private static void setHoure() {
		int[] newArr = setClock(hours, numOfStepsOnHoure);
		hours = newArr;
	}
	
	
	private static void setMinute() {
		int[] newArr = setClock(minutes, numOfStepsOnMinutes);
		minutes = newArr;
	}
	
	
	
	private static int[] setClock(int[] originArr, int stepse) {
		
		int[] newArr = new int[originArr.length];
		
		for (int i = 0; i < originArr.length; i++) {
			newArr[i] = originArr[(i+stepse)%(originArr.length)];
		}
		System.out.print(Arrays.toString(newArr));
		System.out.println();
		return newArr;
	}





	
	
	
}
