import java.util.Scanner;
public class Number_1 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in, "UTF-8");
		System.out.println("Enter N: ");
		int N= input.nextInt();
		for(int i=1; i<=N;i++){
			System.out.println(i);
		}
		input.close();

	}

}
