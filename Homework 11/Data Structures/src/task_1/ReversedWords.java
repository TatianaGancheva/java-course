package task_1;

import java.util.Scanner;
import java.util.Stack;

public class ReversedWords {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in,"UTF-8");
		System.out.println("Enter text to reverse: ");
		String text= input.nextLine();
		input.close();
		input = new Scanner(text);
		Stack<String> stack = new Stack<String>();
		String word = null;
		
		while (input.hasNext()) {
			word = input.next();
			stack.push(word);
		}
		
		while (!stack.isEmpty()) {
			System.out.print(stack.pop() + " ");
		}
		
		input.close();
	}

}
