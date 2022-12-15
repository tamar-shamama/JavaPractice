package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;



public class UniqueChar {

	static String phrase = "this is a sentence";
	
	
	public static void main(String[] args) {
		
		char[] uniques = findAllUniqueChars();
		System.out.println("uniques chars are: " + Arrays.toString(uniques));
	}

	
	
	private static char[] findAllUniqueChars() {
		
		char[] chars = phrase.toCharArray();
		Map<Character, Integer> map = createFrequenciesMap(chars);
		char[] uniques = createUniquesArray(map);
		uniques = filterEmptyVals(uniques);
		return uniques;
	}
	
	

	private static Map<Character, Integer> createFrequenciesMap(char[] chars) {
		
		Map<Character, Integer> map = new HashMap<>();
		
		for (int i = 0; i < chars.length; i++) {
			
			if (map.containsKey(chars[i])) {
				int amount = map.get(chars[i]) + 1;
				map.replace(chars[i], amount);
				
			} else {
				map.put(chars[i], 1);
			}
		}
		return map;
	}

	
	
	private static char[] createUniquesArray(Map<Character, Integer> map) {
		
		char[] uniques = new char[phrase.length()];
		int counter = 0;
		
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			
			char key = entry.getKey();
			
			if (entry.getValue() == 1) {
				uniques[counter] = key;
				counter++;
			}
		}
		return uniques;
	}


	
	static char[] filterEmptyVals(char[] arr) {
		
		int counter = 0;
		
		// get number of valid values
		for (int i = 0; i < arr.length; i++) {
			Character c = arr[i];
			if (!c.equals('\u0000')) {
				counter++;
			}
		}
		
		// create shorter array
		char[] uniques = new char[counter];
		for (int i = 0; i < uniques.length; i++) {
			uniques[i] = arr[i];
		}
		
		return uniques;
	}

}
