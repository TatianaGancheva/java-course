import java.util.Scanner;
public class Number_8_Symetrics {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in, "UTF-8");
		System.out.println("Enter how many numbers : ");
		int k= input.nextInt();
		int[] Array = new int[k];
		System.out.println("Enter your numbers to build an array now: ");
		
		for(int i=0; i<Array.length;i++){
			Array[i]=input.nextInt();
		}
		
		boolean symetricArray=true;
		for (int i=0;i<(Array.length+1)/2;i++ ){
			if(Array[i]!=Array[k-i-1]){
				symetricArray=false;
			}
		}
		input.close();
		System.out.printf("Symetrics: %b%n", symetricArray);
//		for(int num: Array){
//			System.out.print(num+" ");
//		}
	}

}
