package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConsecutiveSequence {

	public static void main(String[] args) {
		
		// question - find the longest consecutive sequence
		
		int[] arr = {49, 3, 200, 6, 201, 4, 1, 70, 5, 202, 203, 204};
		
		System.out.println(Arrays.toString(biggerConsecutiveSequenceFrom(arr)));

	}

	private static int[] biggerConsecutiveSequenceFrom(int[] arr) {
		
		// copy of original array
		int[] newArr = Arrays.copyOf(arr, arr.length);
		
		// sort the array
		Arrays.sort(newArr);
		
		// remove duplicated values
		newArr = Arrays.stream(newArr).distinct().toArray();

		// get all consecutive sequences
		Sequence[] sequences = findAllSequences(newArr);
		
		// get the biggest sequence (as Integer[])
		Sequence biggest = sequences[0];
		for (int i = 1; i < sequences.length; i++) {
			if (sequences[i].getLength() > biggest.getLength()) {
				biggest = sequences[i];
			}
		}
		Integer[] intArr = biggest.sequence;
		
		// convert to int[]
		newArr = convertToInt(intArr);
		return newArr;
	}
	
	
	
	
	private static int[] convertToInt(Integer[] intArr) {
		
		int[] arr = new int[intArr.length];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = intArr[i];
		}
		return arr;
	}
	

	
	
	private static Sequence[] findAllSequences(int[] arr) {
		
		
		List<Integer> list = new ArrayList<>();
		List<Sequence> seq = new ArrayList<>();
		
		
		for (int i = 0; i < arr.length-1; i++) {
			
			boolean found = false;
			
			// add first val from pair
			if (arr[i]+1 == arr[i+1]) {
				list.add(arr[i]);
				found = true;
			}
			
			// add sec val from pair in case this is the last pair in the array
			if (found && i+2 > arr.length-1) {
				
				list.add(arr[i+1]);
				Integer[] a = new Integer[list.size()];
				a = list.toArray(a);
				Sequence s = new Sequence(a);
				seq.add(s);
				break;
			}
			
			
			// add sec val from pair in case this is the last pair in the sequence
			if (found && arr[i+1]+1 != arr[i+2]) {
				
				list.add(arr[i+1]);
				Integer[] a = new Integer[list.size()];
				a = list.toArray(a);
				Sequence s = new Sequence(a);
				list.clear();
				seq.add(s);
				i++;
			}
		}
		
		Sequence[] sequences = new Sequence[seq.size()];
		sequences = seq.toArray(sequences);
		return sequences;
	}




	public static class Sequence {
		
		Integer[] sequence;

		public Sequence(Integer[] sequence) {
			super();
			this.sequence = sequence;
		}
		
		public int getLength() {
			return this.sequence.length;
		}

		public Integer[] getSequence() {
			return sequence;
		}

		@Override
		public String toString() {
			return "Sequence: " + Arrays.toString(sequence);
		}
		
		
		
	}

}
