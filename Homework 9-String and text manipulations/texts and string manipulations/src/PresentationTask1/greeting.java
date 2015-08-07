package PresentationTask1;
import java.util.Scanner;
public class greeting {
	
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in,"UTF-8");
		System.out.println("Enter greeting: ");
		String greeting=input.nextLine();
		
		boolean starts=greeting.startsWith("Greeting");
		System.out.println("it begins with greeting: "+starts);
		boolean ends=greeting.endsWith(".");
		System.out.println("it ends with punkt: "+ends);
		boolean contains=greeting.contains("water");
		System.out.println("it contains water: "+contains);
		input.close();
		
	}

}
