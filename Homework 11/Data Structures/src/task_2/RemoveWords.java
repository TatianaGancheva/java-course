package task_2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class RemoveWords {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in,"UTF-8");
		System.out.println("Enter text: ");
		String text= input.nextLine();
		input.close();
		input=new Scanner(text);
		String word=null;
		Queue<String> sentance= new LinkedList<String>();
		
		while(input.hasNext()){
			word=input.next();
			if(word.length()>=3){
				sentance.offer(word);
			}
		}
		while(!sentance.isEmpty()){
			System.out.print(sentance.poll()+" ");
		}
		
		input.close();
		
				
	}

}