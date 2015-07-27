package methods_and_recursion;

import java.util.Scanner;

public class Number_2 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in, "UTF-8");
		System.out.println("Enter your name: ");
		String name= input.nextLine();
		PrintGreeting(name);
		input.close();

	}
	
	public static void PrintGreeting(String name){
		System.out.println("Greeting " + name + " !");
		

}

}
