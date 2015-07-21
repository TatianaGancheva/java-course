import java.util.Scanner;
public class Number_10 {

	public static void main(String[] args) {
		Scanner input= new Scanner (System.in, "UTF-8");
		System.out.println("Enter the interval of numbers you want to search in: ");
		System.out.println("From number: ");
		int a= input.nextInt();
		System.out.println("To number: ");
		int b= input.nextInt();
		int c=(b-a)+1;
		int counter=a;
		int []Array=new int[c];
		
		System.out.print("The numbers that /3 have no residue are: ");
		for(int i=0;i<c;i++){
			Array[i]=counter;
			if(counter %3==0){
			System.out.print(counter+ " and ");
			}
			counter++;
			
		}
		System.out.println("Your Array is: ");
		for(int k: Array){
			System.out.print( k + " ");
		}
		

		input.close();
	}

}


