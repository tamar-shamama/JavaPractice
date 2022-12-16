package arrays;

import java.util.Arrays;

public class Sort {
	

	public static void main(String[] args) {
		
		// question - sort the arrays
		
		int[] arr1 = {5, 8, 32, 6 , -2, 0, 8, 103};
		
		// actual solution
		sortArr(arr1);
		System.out.println(Arrays.toString(arr1));
		
		// cheat code!
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));

	}

	
	
	private static void sortArr(int[] arr) {
		
		int counter = 1;
		
		while (counter < arr.length) {
			
			counter++;
			
			for (int i = 0; i < arr.length-1; i++) {
				
				int val1 = arr[i];
				int val2 = arr[i+1];
				
				if (val1 > val2) {
					arr[i] = val2;
					arr[i+1] = val1;
				}
			}
		}
	}
	
	
//	private static int[] sortArr(String[] arr) {
//		
////		int counter = 1;
////		
////		while (counter < arr.length) {
////			
////			counter++;
////			
////			for (int i = 0; i < arr.length-1; i++) {
////				
////				int val1 = arr[i];
////				int val2 = arr[i+1];
////				System.out.println(val1 + " " + val2);
////				
////				if (val1 > val2) {
////					arr[i] = val2;
////					arr[i+1] = val1;
////				}
////				System.out.println(Arrays.toString(arr));
////			}
////		}
//		
//		
//		
//		
//		return null;
//	}
	
	
	
}


