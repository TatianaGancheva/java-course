import java.util.Scanner;
public class switchFormPresentation {

	public static void main(String[] args) {
		 Scanner input= new Scanner(System.in, "UTF-8");
		System.out.println("Enter a number: ");
		int num= input.nextInt();
		if (num<=5 && num>1){
			if(num%2==0){
				System.out.println("The number is even");
			}else{
				System.out.println("The number is odd");
			}
		}else if(num>6 && num<=15){
			if(num%3==0){
				System.out.println("The number " + num + " /3 has no residue" );
			}else{
				System.out.println("The number " + num + " /3 has  residue" );
			}
		}else{
			if(num==0){
				System.out.println("The number is 0");
				
			}else if(num<0){
				System.out.println("The number is negative");
				
			}else{
				System.out.println("The number is positive");
				
			}
		}
		input.close();	
	}
}