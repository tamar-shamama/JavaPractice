package arrays;

import java.util.Arrays;

public class SetClock {
	
	
	
	public static void main(String[] args) {
		
		
		// question - rotate the arrays left a number of steps, the way you set
		//            the time in a clock.
		
		
		int[] hours = {1,2,3,4,5,6,7,8,9,10,11,12};
		int[] minutes = new int[60];
		
		int numOfStepsOnHoure = 3;
		int numOfStepsOnMinutes = 32;
		
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
		whatTime(hours, minutes);
		System.out.println();
		
		
		// move array of hours 3 steps
		hours = setHoure(hours, numOfStepsOnHoure);
		whatTime(hours, minutes);
		System.out.println();
		
		
		// move array of minutes 32 steps
		minutes = setMinute(minutes, numOfStepsOnMinutes);
		whatTime(hours, minutes);
		System.out.println();
		
	}

	

	private static void whatTime(int[] hours, int[] minutes) {
		
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
	
	

	private static int[] setHoure(int[] hours, int numOfStepsOnHoure) {
		return setClock(hours, numOfStepsOnHoure);
	}
	
	
	private static int[] setMinute(int[] minutes, int numOfStepsOnMinutes) {
		return setClock(minutes, numOfStepsOnMinutes);
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
