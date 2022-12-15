package arrays;


public class ReverseString {

	
	// question - reverse the order of this string
	
	static String phrase = "this is a meaningless sentence";
	
	
	public static void main(String[] args) {
		
		String reversed_phrase_1 = reverse1();
		String reversed_phrase_2 = reverse2();
		String reversed_phrase_3 = reverse3();
		
		System.out.println("the phrase: " + phrase);
		System.out.println("the reverse: " + reversed_phrase_1);
		System.out.println("the reverse: " + reversed_phrase_2);
		System.out.println("the reverse: " + reversed_phrase_3);
	}

	
	

	// solution #1 - char array
	
	private static String reverse1() {
		
		char[] reverse = new char[phrase.length()];
		
		for (int i = 0; i < phrase.length(); i++) {
			reverse[i] = phrase.charAt(phrase.length()-1 -i);
		}
		return String.valueOf(reverse);
	}
	
	
	
	
	// solution #2 - string builder

	private static String reverse2() {
		
		StringBuilder stringBuilder = new StringBuilder();
		
		for (int i = phrase.length()-1; i >= 0; i--) {
			stringBuilder.append(phrase.charAt(i));
		}
		return stringBuilder.toString();
	}
	
	
	
	
	// solution #3 - string builder reverse!
	
	private static String reverse3() {
		
		StringBuilder stringBuilder = new StringBuilder(phrase);
		return stringBuilder.reverse().toString();
	}
	
	
	
}
