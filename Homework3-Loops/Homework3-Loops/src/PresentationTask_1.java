import java.util.Scanner;
public class PresentationTask_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Enter number: ");
		int n=input.nextInt();
		System.out.println("Enter power: ");
		int m=input.nextInt();
		
		int result=1;
		for(int i=1; i<=m; i++){
			result*=n;
		}
		System.out.println("The result is: "+ result);
		input.close();
	}

}


