package task_2;

import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;
public class UniqueWords {

	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in,"UTF-8");
		System.out.println("Enter text: ");
		String text=input.nextLine();
		System.out.println("The unique words in your text are: ");
		uniqueWords(text);
		input.close();
	}
	public static void uniqueWords(String text){
		String[] arr= text.toLowerCase().split("[ .,;!?]");
		HashMap<String,Integer>countW=new HashMap<String,Integer>();
		for(String add:arr){
			Integer count=countW.get(add);
			if(count==null){
				count=0;
			}
			countW.put(add, count+1);
		}
		Set<String> key= countW.keySet();
		for(String add:key){
			int count=countW.get(add);
			if(count==1){
				System.out.printf("%s",add);
			}
		}
		
	}

}
