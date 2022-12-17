package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Anagrams {
	
	
	public static void main(String[] args) {
		
		// question - are two of those phrases anagrams?
		
		String phrase1 = "this is a phrase";
		String phrase2 = "a phrase this is";
		String phrase3 = "which witch watch which watch";
		
		
		// sol #1
		
		System.out.println("====== sol #1 ======= \n");
		
		if (areAnagrams_1(phrase1, phrase2)) {
			System.out.println("[" + phrase1 + "] and [" + phrase2 + "] are anagrams");
		} else {
			System.out.println("[" + phrase1 + "] and [" + phrase2 + "] are not anagrams");
		}
		
		
		if (areAnagrams_1(phrase1, phrase3)) {
			System.out.println("[" + phrase1 + "] and [" + phrase3 + "] are anagrams");
		} else {
			System.out.println("[" + phrase1 + "] and [" + phrase3 + "] are not anagrams");
		}
		
		System.out.println();
		
		
		
		// sol #2
		
		System.out.println("====== sol #2 ======= \n");
		
		if (areAnagrams_2(phrase1, phrase2)) {
			System.out.println("[" + phrase1 + "] and [" + phrase2 + "] are anagrams");
		} else {
			System.out.println("[" + phrase1 + "] and [" + phrase2 + "] are not anagrams");
		}
		
		
		if (areAnagrams_2(phrase1, phrase3)) {
			System.out.println("[" + phrase1 + "] and [" + phrase3 + "] are anagrams");
		} else {
			System.out.println("[" + phrase1 + "] and [" + phrase3 + "] are not anagrams");
		}
		
		System.out.println();
		
		
		
		// sol #3
		
		System.out.println("====== sol #3 ======= \n");
		
		if (areAnagrams_3(phrase1, phrase2)) {
			System.out.println("[" + phrase1 + "] and [" + phrase2 + "] are anagrams");
		} else {
			System.out.println("[" + phrase1 + "] and [" + phrase2 + "] are not anagrams");
		}
		
		
		if (areAnagrams_3(phrase1, phrase3)) {
			System.out.println("[" + phrase1 + "] and [" + phrase3 + "] are anagrams");
		} else {
			System.out.println("[" + phrase1 + "] and [" + phrase3 + "] are not anagrams");
		}
		
		System.out.println();
		
		
		 
		
	}
	
	
	



	// solution #1 - hashmap
	// ============================================================

	private static boolean areAnagrams_1(String phrase1, String phrase2) {
		
		if (phrase1.length() != phrase2.length()) return false;
		
		char[] p1 = phrase1.toCharArray();
		char[] p2 = phrase2.toCharArray();
		
		Map<Character, Integer> map1 = countChars(p1);
		Map<Character, Integer> map2 = countChars(p2);
		
		return map1.equals(map2);
	}

	
	
	/** creates a map with char as key and number of appearances on char[] array as value
	 * @param phrase
	 * @return Map <char, amount of appearances>
	 */
	private static Map<Character, Integer> countChars(char[] phrase) {
		
		Map<Character, Integer> map = new HashMap<>();
		
		for (int i = 0; i < phrase.length; i++) {
			
			if (map.containsKey(phrase[i])) {
				int amount = map.get(phrase[i]) + 1;
				map.replace( phrase[i], amount);
				
			} else {
				map.put(phrase[i], 1);
			}
		}
		return map;
	}
	
	
	
	
	
	// solution #2 - Arrays.sort
	// ============================================================
	
	private static boolean areAnagrams_2(String phrase1, String phrase2) {
		
		if (phrase1.length() != phrase2.length()) {
			return false;
		}
		
		char[] p1 = phrase1.toCharArray();
		char[] p2 = phrase2.toCharArray();
		
		Arrays.sort(p1);
		Arrays.sort(p2);
		
		return p1.equals(p2);
	}
	
	
	
	// solution #3 - ASCII vals
	// ============================================================

	private static boolean areAnagrams_3(String phrase1, String phrase2) {
		
		if (phrase1.length() != phrase2.length()) {
			return false;
		}
		
		int[] char_frequencies = new int[27];
		addFrequencies(phrase1, char_frequencies);
		removeFrequencies(phrase2, char_frequencies);
		
		for (int i = 0; i < char_frequencies.length; i++) {
			
			if (char_frequencies[i] != 0) {
				return false;
			}
		}
		return true;
	}



	
	/** add 1 in the appropriate index on an array of zeros (int[27])
	 *  to every char on the {@code phrase}, when index 0 is 'a', index 1 is 'b' and
	 *  so forth. index 26 is space.
	 * @param phrase
	 * @param char_frequencies
	 */
	private static void addFrequencies(String phrase, int[] char_frequencies) {
		
		for (int i = 0; i < phrase.length(); i++) {
			int index = setIndex(phrase.charAt(i));
			char_frequencies[index]++;
		}
	}
	
	
	/** remove 1 in the appropriate index on an int array (int[27])
	 *  to every char on the {@code phrase}, when index 0 is 'a', index 1 is 'b' and
	 *  so forth. index 26 is space.
	 * @param phrase
	 * @param char_frequencies
	 */
	private static void removeFrequencies(String phrase, int[] char_frequencies) {
		
		for (int i = 0; i < phrase.length(); i++) {
			int index = setIndex(phrase.charAt(i));
			char_frequencies[index]--;
		}
	}
	
	
	
	/** set an index to every letter on the abc, so a is 0, b is 1 etc.
	 * space is 26.
	 * @param character
	 * @return int index number
	 */
	private static int setIndex(char character) {
		
		int asciiVal = character;
		int index;
		
		if (asciiVal == 32) {        // case space
			index = 26;
		
		} else {                    // case letter
			index = asciiVal - 97;
		}
		return index;
	}
	
	



	
	
}
