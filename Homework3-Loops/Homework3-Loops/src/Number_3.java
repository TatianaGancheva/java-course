import java.util.Scanner;
public class Number_3 {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in, "UTF-8");
		System.out.println("Enter your five numbers to find smallest and largest: ");
		int largest=0;
		int smallest=0;
		int num;
		num=input.nextInt();
		smallest=num; 
		for(int i=2; i<=5; i++){
			num=input.nextInt();
			if(num>largest){
				largest=num;
			}
			if(num<smallest){
				smallest=num;
			}
		}
		System.out.println("The largest of entered numbers is: "+largest);
		System.out.println("The smallest of entered numbers is: "+smallest);
		input.close();

	}

}
