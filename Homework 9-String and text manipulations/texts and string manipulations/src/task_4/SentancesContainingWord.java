package task_4;
import java.util.Scanner;
public class SentancesContainingWord {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in,"UTF-8");
		System.out.println("Enter text: ");
		String text=input.nextLine();
		System.out.println("Enter word: ");
		String word=input.nextLine();
		
		System.out.println("The sentances wich contain your word are: ");
		System.out.println(findSentances(text,word));
		input.close();
	}
	public static String findSentances(String text, String word){
		StringBuilder sb= new StringBuilder(text.length());
		String[]arr=text.split("[.]");
		for(int i=0; i<arr.length;i++){
			if(arr[i].indexOf(word)!=-1){
				sb.append(arr[i]);
				sb.append(".");
				
			}
		}
		return  sb.toString();
	}

}
