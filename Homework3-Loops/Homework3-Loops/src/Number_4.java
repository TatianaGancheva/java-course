import java.util.Scanner;
public class Number_4 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in,"UTF-8");
		System.out.println("Enter N: ");
		int N=input.nextInt();
		System.out.println("Enter K: ");
		int K= input.nextInt();
		int N1 =1;
		int K1=1;
		if(K<1 || K>N){
			System.out.println("Your numbers must be 1<K<N!");
		}else{
			for(int i=1; i<=N; i++){
			N1= N1 *i;
		}
		for(int i=1; i<=K; i++){
			K1= K1 *i;
		}
		double result=N1/K1;
		System.out.println("N! / K! = "+result);
		//System.out.println(N1);
		//System.out.println(K1);
		
		}
		input.close();
	}

}
