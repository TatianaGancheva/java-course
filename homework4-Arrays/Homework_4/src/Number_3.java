import java.util.Scanner;
public class Number_3 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in, "UTF-8");
		System.out.println("Please enter ten numbers to fill the array: ");
		int [] array= new int [10];
		 
		for(int i=0; i< array.length ; i++){
			array[i]=input.nextInt();
			
		}
		System.out.print("You array is:  ");
		for( int n: array){
			System.out.print( n+ "  ");
			
		}
		System.out.println();
		System.out.print("Your X10 array is: ");
		for(int j=0; j<array.length; j++){
			int a=array[j];
			a*=10;
			System.out.print(a+"  ");
		}
		input.close();
	}

}
