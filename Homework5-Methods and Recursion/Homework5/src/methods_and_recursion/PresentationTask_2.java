package methods_and_recursion;
import java.util.Scanner;

public class PresentationTask_2 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in,"UTF-8");
		System.out.println("Enter number: ");
		int n= input.nextInt();
		Sum( n);
		System.out.println(Sum(n));
		input.close();

	}
	public static int Sum(int n){
		if(n>0){
			return n+Sum(n-1);
		}else{
			return 0;
		}
	}

}
