package methods_and_recursion;

import java.util.Scanner;

public class Numer_1 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in,"UTF-8");
		System.out.println("Enter the first number: ");
		int a=input.nextInt();
		System.out.println("Enter the second number: ");
		int b=input.nextInt();
		System.out.println("Enter the third number: ");
		int c= input.nextInt();
		
		System.out.println("The larger number from entered is:  "+ GetMax(GetMax(a,b), c ));
		input.close();

	}
	
	public static  int GetMax(int a, int b){
		if(a>b){
			return a;
		}else{
			return b;
		}
	}
	

}
