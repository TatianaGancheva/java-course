import java.util.Scanner;
public class Number_8 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in, "UTF-8");
		System.out.println("Enter five numbers to compare: ");
		
		double largest=0;
		double num;
		
		for(int i=1; i<=5; i++){
			num=input.nextDouble();
			if(num>largest){
				largest=num;
			}
		}
		System.out.println("the largest number is: "+ largest);
		input.close();

	}

}
