package arrays;

import java.util.Arrays;

import arrays.TwoSum.Pair;

public class TwoSumSorted {

	public static void main(String[] args) {
		
		// question - find all set of values whose sum is the target value.
		//            notice the array is sorted.
		
		
		int[] arr = {-13, 1, 2, 3, 5, 7, 10, 13, 17, 20, 24, 35 };
		int targetVal = 22;
		
		Pair[] sol = findPairs(arr, targetVal);
		System.out.println(Arrays.toString(sol));

	}

	
	
	
	/** finds all pairs with correct sum in the given array, and returns a Pair[] array of them
	 * @param arr
	 * @param targetVal
	 * @return
	 */
	private static Pair[] findPairs(int[] arr, int targetVal) {
		
		Pair[] pairs = new Pair[arr.length/2];
		
		int l = 0;
		int r = arr.length-1;
		int counter = 0;
		
		
		while (l < r) {
			
			int leftVal = arr[l];
			int rightVal = arr[r];
			int sum = leftVal + rightVal;
			
			if (sum == targetVal) {
				pairs[counter] = new Pair(0, leftVal, arr.length-1, rightVal);
				l++;
				r--;
				counter++;
			
			} else if (sum > targetVal) {
				r--;
			
			} else if (sum < targetVal) {
				l++;
			}
		}
		
		pairs = TwoSum.filterEmptyVals(pairs, counter);
		return pairs;
	}
	
	
	
}
