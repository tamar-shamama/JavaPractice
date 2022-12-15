package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	public static void main(String[] args) {
		
		// question - fine all sets of two numbers in this array whose 
		//            sum is the target value and show their indexes.
		
		int[] numbers = {5, 8, 3, -4, 6, 1, 2, 0, 7, 11};
		int targetValue = 7;
		
		Pair[] sol1 = firstSolution(numbers, targetValue);
		System.out.println(Arrays.toString(sol1) + "\n");
		
		Pair[] sol2 = secondSolution(numbers, targetValue);
		System.out.println(Arrays.toString(sol2));
	}

	


	// solution #1 - for loop

	private static Pair[] firstSolution(int[] numbers, int targetValue) {
		
		Pair[] pairs = new Pair[numbers.length];
		int count = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			
			for (int j = numbers.length-1; j > i; j--) {
				
				if (numbers[i] + numbers[j] == targetValue) {
					pairs[count] = new Pair(i, numbers[i], j, numbers[j]);
					count++;
				}
			}
		}
		pairs = filterEmptyVals(pairs, count);
		return pairs;
	}



	
	// solution #2 - hash map
	
	private static Pair[] secondSolution(int[] numbers, int targetValue) {
		
		Map<Integer, Integer> map = new HashMap<>();
		Pair[] pairs = new Pair[numbers.length];
		int count = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			
			if (map.containsKey(numbers[i])) {
				pairs[count] = new Pair(i, numbers[i], map.get(numbers[i]), targetValue - numbers[i]);
				count++;
			}
			map.put(targetValue - numbers[i], i);
		}
		pairs = filterEmptyVals(pairs, count);
		return pairs;
	}


	
	
	

	/** creates a shorter copy of the given array, with length of {@code count}  - 
	 * assuming all of the values after {@code count} are empty.
	 * @param pairs
	 * @param count
	 * @return Pair[]
	 */
	static Pair[] filterEmptyVals(Pair[] pairs, int count) {
		
		Pair[] arr = new Pair[count];
		for (int i = 0; i < count; i++) {
			arr[i] = pairs[i];
		}
		return arr;
	}




	public static class Pair {
		
		public int index1;
		public int num1;
		public int index2;
		public int num2;
		
		
		public Pair(int index1, int num1, int index2, int num2) {
			super();
			this.index1 = index1;
			this.num1 = num1;
			this.index2 = index2;
			this.num2 = num2;
		}


		
		@Override
		public String toString() {
			return "(" + index1 + ")" + num1 + " + (" + index2 + ")"  + num2;
		}
	}

}
