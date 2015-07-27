package methods_and_recursion;

import java.util.Scanner;

public class Number_1_1 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in,"UTF-8");
		System.out.println("Enter the first number: ");
		int a=input.nextInt();
		System.out.println("Enter the second number: ");
		int b=input.nextInt();
		System.out.println("Enter the third number: ");
		int c= input.nextInt();
	
		System.out.println("max: "+findLarger(findLarger(a,b), c));
		input.close();

	}
	
	public static int findLarger (int...numbers){
		int larger=0;
		for(int number: numbers){
			if(number>larger){
				larger=number;
			}
		}
		return larger;
	}

}
