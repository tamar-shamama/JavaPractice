package arrays;

import java.util.Arrays;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		
		int[] arr = { 20, 20, 30, 60, 54, 70, 54};
		System.out.println("original array: " + Arrays.toString(arr));
		
		// sol #1
		int[] newArr1 = removeDuplicate_1(arr);
		System.out.println("array without duplicated val: " + Arrays.toString(newArr1));
		
		// sol #2
		int[] newArr2 = removeDuplicate_2(arr);
		System.out.println("array without duplicated val: " + Arrays.toString(newArr2));

	}

	
	// sol #1 - for loop
	// ============================================================

	private static int[] removeDuplicate_1(int[] arr) {
		
		// copy og original array (so the original remains unchanged)
		int[] newArr = Arrays.copyOf(arr, arr.length);
		
		
		for (int i = 0; i < newArr.length; i++) {
			
			int currentVal = -1;
			
			// skip iteration if value was already removed
			if (newArr[i] != -1) {
				currentVal = newArr[i];
			
			} else if (newArr[i] == -1) {
				continue;
			}
			
			// remove duplicated value and replace with -1
			for (int j = i+1; j < newArr.length; j++) {
				
				if (newArr[j] == currentVal) {
					newArr[j] = -1;
				}
			}
		}
		
		// remove -1's from the array
		newArr = Arrays.stream(newArr).filter(val -> val != -1).toArray();
		return newArr;
	}
	
	
	
	
	// sol #2 - stream
	// =========================================================
	private static int[] removeDuplicate_2(int[] arr) {
		
		int[] newArr = Arrays.stream(arr).distinct().toArray();
		return newArr;
	}

}
