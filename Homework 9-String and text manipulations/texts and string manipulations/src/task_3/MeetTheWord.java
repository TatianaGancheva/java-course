package task_3;
import java.util.Scanner;
public class MeetTheWord {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in,"UTF-8");
		System.out.println("Enter text: ");
		String text=input.nextLine();
		System.out.println("Enter word: ");
		String word=input.nextLine();
		int count=findTheWord(text,word);
		System.out.println("The word "+word+" can be found "+count+" times in your text.");
		input.close();
	}
	public static int findTheWord(String text,String word){
		int index=text.indexOf(word);
		int count=0;
		while(index!=-1){
			count++;
			index=text.indexOf(word,index+1);
			
		}
		return count;
		
	}

}
