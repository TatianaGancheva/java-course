package methods_and_recursion;

import java.util.Random;

public class Number_3 {

	public static void main(String[] args) {
		Random input= new Random();
	
		for(int i=0; i<20; i++){
			int b= input.nextInt(10);
			int a= input.nextInt(10);
			int c= input.nextInt(10);
			int result=multiplyNumbers(a,b,c);
			multiplyNumbers(a,b,c);
			System.out.println(i+1+ " : " + a+ "*" + b + "*"+ c + "*" + "result: " + result);
		}
		
		
	}
	
	public static int multiplyNumbers(int a,int  b,int c){
		
		int result= a*b*c;
		return result;
	}

}
