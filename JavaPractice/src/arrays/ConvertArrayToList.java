package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertArrayToList {

	public static void main(String[] args) {
		
		int[] arr = {4, 6, 32, -7, 0, 15};
		
		List<Integer> list1 = covertArrToList_1(arr);
		System.out.println(list1);
		
		List<Integer> list2 = covertArrToList_2(arr);
		System.out.println(list2);
		
		List<Integer> list3 = covertArrToList_3(arr);
		System.out.println(list3);
	}

	
	

	// sol #1 - for loop
	// ==========================================

	private static List<Integer> covertArrToList_1(int[] arr) {
		
		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		return list;
	}
	
	
	
	// sol #2 - asList
	// ============================================

	private static List<Integer> covertArrToList_2(int[] arr) {
		
		// turns out asList only works with arrays of objects or wrapper classes,
		// and NOT arrays of primitives, so it doesn't work on int[] arr directly
		
		// convert to Integer[] by for loop
		Integer[] intArr1 = RemoveValue.convertToInteger(arr);
		
		//OR... !
		
		// convert to Integer[] by stream
		Integer[] intArr2 = Arrays.stream(arr).boxed().toArray(Integer[]::new);

		// this list will be syncronized with the array so it can not be change...
        List<Integer> list1 = Arrays.asList(intArr1);
        
        // a preferable way is:
        List<Integer> list2 = new ArrayList<>(Arrays.asList(intArr1));
		return list2;
	}
	
	
	// sol #3 - stream collectors toList!
	
	private static List<Integer> covertArrToList_3(int[] arr) {
		
		List<Integer> list = Arrays.stream(arr)
		.boxed()
		.collect(Collectors.toList());
		return list;
		
		
	}
}
