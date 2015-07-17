import java.util.Scanner;
public class Number_2 {

	public static void main(String[] args) {
		Scanner  input= new Scanner(System.in, "UTF-8");
		System.out.println("Enter three numbers: ");
		double x= input.nextDouble();
		double y= input.nextDouble();
		double z= input.nextDouble();
		if(x>y && x>z){
			System.out.println("The largest number is" + x );
		}else if(y>x && y>z){
			System.out.println("The largest number is" + y );
		}else if(z>x && z>y){
			System.out.println("The largest number is" + z );
		}else{
			System.out.println("The numbers are not different! ");
		}
	input.close();

	}

}
