package methods_and_recursion;

import java.util.Scanner;

public class Number_7 {
	public static int numberOfLoops;
	public static int numberOfIterations;
	public static int [] Loops;

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("enter number: ");
		numberOfLoops=input.nextInt();
		numberOfIterations=numberOfLoops;
		input.close();
		Loops=new int[numberOfLoops];
		nestedLoops(0);
		

	}
	
	public static void nestedLoops(int current){
		if (current==numberOfLoops){
			printLoops();
			return;
		}
		for(int counter=1;counter<=numberOfIterations; counter++){
			Loops[current]=counter;
			nestedLoops(current+1);
			
		}
	}
	
	public static void printLoops(){
		for(int i=0;i<numberOfLoops;i++){
			System.out.printf("%d",Loops[i]);
		}
		System.out.println();
	}


}
