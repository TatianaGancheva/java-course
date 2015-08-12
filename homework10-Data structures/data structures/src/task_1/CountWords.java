package task_1;

import java.util.Set;
import java.util.TreeMap;
public class CountWords {

	public static void main(String[] args) {
		String[] words = { 
				"tatiana", "hello", "bye", "green", "word", "yes", "blue",
				"code", "yes", "green", "red", "cat", "yellow",
				"blue", "code", "red", "word", "yellow"};
			
			TreeMap<String, Integer> wordsCount = new TreeMap<String, Integer>();
				
			for (String word : words) {
				Integer count = wordsCount.get(word);
				if (count == null) {
					count = 0; 
				}
				wordsCount.put(word, count + 1);
			}
			
			Set<String> wordKeys = wordsCount.keySet();
			
			System.out.println();
			
			for (String word : wordKeys) {
				int count = wordsCount.get(word);
				System.out.printf("we can find : %s  %d times\n", word, count);
			}
			
			
		

	}

}
