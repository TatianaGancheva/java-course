import java.util.Scanner;
public class Number_1 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in, "UTF-8");
		
		System.out.println("Please enter the first number: ");
		float a= input.nextFloat();
		input.nextLine();
		System.out.println("Please enter the second number: ");
		float b=input.nextInt();
		float lice =a*b;
		System.out.print("The face of the figure is: ");
		System.out.println(lice);
		
		input.close();
	}

}
