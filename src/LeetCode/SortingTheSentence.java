package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class SortingTheSentence {
	
/* 1. Split the sentence by whitespace 
 * 2. Select DS to store the words Array/ArrayList
 * 3. Iterate and get the last letter
 * 4. Join all the words with space
 */
	
public static String sortSentence(String sentence) {
	// Split the given String into words
	String[] words = sentence.split(" ");

	String[] wordsWithCorrectPosition = new String[words.length];
	for (String word : words) {
		int index = Character.getNumericValue(word.charAt(word.length() - 1));
		wordsWithCorrectPosition[index - 1] = word.substring(0, word.length() - 1);
		}
		
		return String.join(" ", wordsWithCorrectPosition); 
	}

public static String sortSentenceWithArrayList(String sentence) {
	// Split the given String into words
	String[] words = sentence.split(" ");
	List<String> wordList = new ArrayList<>(List.of(words));

	for (String word : words) {
		int index = Character.getNumericValue(word.charAt(word.length() - 1));
		wordList.set(index - 1, word.substring(0,word.length() - 1));
		}
		
		return String.join(" ", wordList); 
	}

	public static void main(String[] args) {
		System.out.println(sortSentence("is2 sentence4 This1 a3"));
		System.out.println(sortSentence("Myself2 Me1 I4 and3"));
		System.out.println("*****************************");
		System.out.println(sortSentenceWithArrayList("is2 sentence4 This1 a3"));
		System.out.println(sortSentenceWithArrayList("Myself2 Me1 I4 and3"));
	}

}
