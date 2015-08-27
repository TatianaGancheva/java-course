package OddEvenSort;

import java.util.Scanner;
import java.util.Arrays;
public class SortNumbers {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in,"UTF-8");
		System.out.println("Enter 10 numbers: ");
		int[]entered=new int[10];
		for(int i=0;i<entered.length;i++){
			entered[i]=input.nextInt();
		}
		input.close();
		
		System.out.println("Before: " + Arrays.toString(entered));
		int[] even= new int[10];
		int [] odd= new int[10];
		for(int i=0;i<entered.length;i++){
			if(entered[i]%2==0){
				even[i]=entered[i];
			}else{
				odd[i]=entered[i];
			}
		}
		BubbleSortOdd(odd);
		BubbleSortEven(even);
		
		System.out.println("Sorted even numbers: ");
		for(int k:odd){
			System.out.print(k+" ");
		}
		
		System.out.println();
		
		System.out.println("Sorted even numbers: ");
		for(int k:even){
			System.out.print(k+" ");
		}
		
		
	}
	
	public static void BubbleSortEven(int[]arr){
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	
	public static void BubbleSortOdd(int[]arr){
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
}
	


