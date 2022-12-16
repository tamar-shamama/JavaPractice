package arrays;


public class ReverseString {

	
	// question - reverse the order of this string
	
	
	
	public static void main(String[] args) {
		
		String phrase = "this is a meaningless sentence";
		
		String reversed_phrase_1 = reverse1(phrase);
		String reversed_phrase_2 = reverse2(phrase);
		String reversed_phrase_3 = reverse3(phrase);
		
		System.out.println("the phrase: " + phrase);
		System.out.println("the reverse: " + reversed_phrase_1);
		System.out.println("the reverse: " + reversed_phrase_2);
		System.out.println("the reverse: " + reversed_phrase_3);
	}

	
	

	// solution #1 - char array
	
	private static String reverse1(String phrase) {
		
		char[] reverse = new char[phrase.length()];
		
		for (int i = 0; i < phrase.length(); i++) {
			reverse[i] = phrase.charAt(phrase.length()-1 -i);
		}
		return String.valueOf(reverse);
	}
	
	
	
	
	// solution #2 - string builder

	private static String reverse2(String phrase) {
		
		StringBuilder stringBuilder = new StringBuilder();
		
		for (int i = phrase.length()-1; i >= 0; i--) {
			stringBuilder.append(phrase.charAt(i));
		}
		return stringBuilder.toString();
	}
	
	
	
	
	// solution #3 - string builder reverse!
	
	private static String reverse3(String phrase) {
		
		StringBuilder stringBuilder = new StringBuilder(phrase);
		return stringBuilder.reverse().toString();
	}
	
	
	
}
