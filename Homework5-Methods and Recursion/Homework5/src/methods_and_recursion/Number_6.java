package methods_and_recursion;

import java.util.Scanner;

public class Number_6 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in, "UTF-8");
		System.out.println("Enter number to find factorial: ");
		int num= input.nextInt();
		long factorial= factorial(num);
		System.out.println(num+"! = "+factorial);
		input.close();

	}
	public static long factorial(int num){
		if(num==0){
			return 1;
		}else{
			return num*factorial(num-1);
		}
	}
}
