package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveValue {

	public static void main(String[] args) {
		
		// question - remove specific value from array
		
		int[] arr = {1, 5, 44, 6, 9, -4, 12, 44, 9, 43};
		int valueToRemove = 44;
		System.out.println("original array is: " + Arrays.toString(arr));
		
		// sol #1 - for loop
		int[] newArr1 = removeValue_1(arr, valueToRemove);
		System.out.println("newArr1 is: " + Arrays.toString(newArr1));
		
		// sol #2 - stream
		int[] newArr2 = removeValue_2(arr, valueToRemove);
		System.out.println("newArr2 is: " +Arrays.toString(newArr2));
		
		// sol #3 - list
		int[] newArr3 = removeValue_3(arr, valueToRemove);
		System.out.println("newArr3 is: " +Arrays.toString(newArr3));
		
	}


	
	


	// solution #1 - double for loop
	// ========================================================

	private static int[] removeValue_1(int[] arr, int valueToRemove) {
		
		int newLength = get_Length_Without_Unwanted_Val(arr, valueToRemove);
		
		int[] newArr = new int[newLength];
		int originalArrStartPoint = 0;
		
		for (int i = 0; i < newArr.length; i++) {
			
			for (int j = originalArrStartPoint; j < arr.length; j++) {
				
				if (arr[j] != valueToRemove) {
					newArr[i] = arr[j];
					originalArrStartPoint = j+1;
					break;
				}
			}
		}
		return newArr;
	}

	
	private static int get_Length_Without_Unwanted_Val(int[] arr, int valueToRemove) {
		
		int counter = arr.length;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == valueToRemove) {
				counter--;
			}
		}
		return counter;
	}
	
	
	
	// solution #2 - stream filter!
	// ==================================================================
	
	private static int[] removeValue_2(int[] arr, int valueToRemove) {
		
		int[] newArray = Arrays.stream(arr)
				.filter(val -> val != valueToRemove)
				.toArray();
		
		return newArray;
	}
	
	
	
	
	
	// solution #3 - convert to list and back to array
	// ==================================================================
	
	
	// I think it would be more efficient to just convert
	// the array to list using loop than with "asList" because
	// asList doesn't accept int[]...
	
	// same with converting the list back to array of int, because
	// "toArray" can only return array of Integers... `\_()_/`
	
	
	
	private static int[] removeValue_3(int[] arr, int valueToRemove) {
		
		Integer[] intArr = convertToInteger(arr);
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(intArr));
		
		// removeAll accept collection
		List<Integer> val = new ArrayList<>();
		val.add(valueToRemove);
		list.removeAll(val);
		
		// convert to array
		Object[] newObjectArr = list.toArray();
		Integer[] newIntArr1 = Arrays.stream(newObjectArr).toArray(Integer[]::new);
		
		// or
		Integer[] newIntArr2 = new Integer[list.size()];
		newIntArr2 = list.toArray(newIntArr2);
		
		int[] newArr = convertToInt(newIntArr1);
		return newArr;
	}



	/** convert an array of Integer to array of int
	 * @param intArr
	 * @return int[] arr
	 */
	private static int[] convertToInt(Integer[] intArr) {
		
		int[] arr = new int[intArr.length];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = intArr[i];
		}
		return arr;
	}



	/** convert an array of int to array of Integer
	 * @param arr
	 * @return Integer[] intArr
	 */
	public static Integer[] convertToInteger(int[] arr) {
		
		Integer[] intArr = new Integer[arr.length];
		
		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = arr[i];
		}
		return intArr;
	}

	
	
	
	
	
}
