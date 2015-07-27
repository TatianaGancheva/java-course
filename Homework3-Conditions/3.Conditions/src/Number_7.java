import java.util.Scanner;
import java.lang.Math;
public class Number_7 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in, "UTF-8");
		System.out.println("Enter a, b,c: ");
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		double D;
		D=(b*b)-(4*a*c);
		
		if(Math.sqrt(D)<0){
			System.out.println("No solution!");
			
		}else if(Math.sqrt(D)==0){
			int x= -b/(2*a);
			System.out.println("The equation has one solution: x1,2= " + x);
			
		}else{
			double X1=((-b+Math.sqrt(D)))/(2*a)	;	
			double X2=((-b-Math.sqrt(D)))/(2*a)	;
			System.out.println("X1= "+X1+"  X2= "+X2);
		}
		input.close();
		

	}

}





