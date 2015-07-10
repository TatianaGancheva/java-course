import java.util.Scanner;
public class Number_6 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in,"UTF-8");
		System.out.println("Enter r: ");
		double r= input.nextDouble();
		
		float P= (float)( r*Math.PI*2);
		float S= (float)(Math.PI*r*r);
		
		System.out.println("The parameter is :" + P  );
		System.out.println("The aria is: "+S);
		input.close();
		
	}

}
