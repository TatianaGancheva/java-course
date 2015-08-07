package task_1;
import java.util.Scanner;

public class ReversedWord {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in,"UTF-8");
		System.out.print("Enter string to reverse: ");
		String text=input.nextLine();
		String reversed=reverseText(text);
		System.out.println("Your reverse string is: "+reversed);
		input.close();

	}
	public static String reverseText(String text){
		StringBuilder sb= new StringBuilder();
		for(int i=text.length()-1;i>=0;i--){
			sb.append(text.charAt(i));
		}
		return sb.toString();
	}

}
