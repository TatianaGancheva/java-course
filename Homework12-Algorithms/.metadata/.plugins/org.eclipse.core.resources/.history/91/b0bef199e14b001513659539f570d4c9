package sortAlphabetical;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in,"UTF-8");
		System.out.println("enter sentence:");
		//String sentence = input.nextLine();
		String sentence= input.nextLine().replaceAll("[\\W\\s]+", " ");
		String[] arrayWords = sentence.split("[\\s]");
		//String[] arrayText = text.split("[\\s]");
		bubble sort = new bubble();
		sort.bubbleSortString(arrayWords);
		
		System.out.println();
		
		print(arrayWords);
		
		input.close();
	}
	
	
	
	public static void print(String[] arrayWords){
		for(int i = 0 ; i < arrayWords.length ; i++){
			System.out.println(arrayWords[i]);
		}
	}

}
