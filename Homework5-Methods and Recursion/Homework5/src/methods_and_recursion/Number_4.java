package methods_and_recursion;

import java.util.Scanner;

public class Number_4 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in,"UTF-8");
		System.out.println("Please enter a number: ");
		int num= input.nextInt();
		checkEven(num);
		String print=checkEven(num);
		System.out.println(print);
		input.close();

	}
	
	public static String checkEven (int num){
		String print;
		if(num%2==0){
			print= "EVEN!";
		}else{
			print= "ODD!";
			
		}
		return print;
	}

}