import java.util.Scanner;
public class PresentationTask_2 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in, "UTF-8");
		System.out.println("Enter numbers to sum. When you want to stop, enter zero,please. ");
		double num;
		double sum=0;
		for(;; ){
			num=input.nextDouble();
			sum+=num;
			if(num==0){
				break;
			}
			
		}
		System.out.println("The sum of your numbers is : "+sum);
		input.close();

	}

}
