package task_2;
import java.util.Scanner;
public class Reverse_words {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in, "UTF-8");
		System.out.println("Enter word to reverse: ");
		String word=input.nextLine();
		System.out.println("Enter text: ");
		String text=input.nextLine();
		String upper=word.toUpperCase();
		String newText=text.replace(word, upper);
		System.out.println(newText);
		input.close();
	}

}
