import java.util.Scanner;
public class Number_8 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in, "UTF-8");
		System.out.println("Enter number to check for primary: ");
		int num=input.nextInt();
		int residue=num%2;
		boolean primary= residue==0;
		System.out.print("The number is prime: "+ primary);
		
		input.close();
		

	}

}
