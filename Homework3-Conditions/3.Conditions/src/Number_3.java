import java.util.Scanner;
public class Number_3 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in, "UTF-8");
		System.out.println("Enter a number from 0 to 9 please : ");
		int num= input.nextInt();
		switch(num){
		case 1: 
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		case 4:
			System.out.println("four");
			break;
		case 5:
			System.out.println("five");
			break;
		case 6:
			System.out.println("six");
			break;
		case 7:
			System.out.println("seven");
			break;
		case 8:
			System.out.println("eight");
			break;
		case 9:
			System.out.println("nine");
			break;	
		default:
			System.out.println("Your number is not between 0 and 9!");
			
		}
		input.close();
		

	}

}
