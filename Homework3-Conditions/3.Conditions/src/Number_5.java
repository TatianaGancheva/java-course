import java.util.Scanner;
public class Number_5 {

	public static void main(String[] args) {
		 Scanner input=new Scanner( System.in, "UTF-8");
		 System.out.println("Enter your points between  1 and 9 : ");
		 int points=input.nextInt();
		 switch(points){
		 case 1:
		 case 2:
		 case 3:
			 points*=5;
			 System.out.println("Your points are " + points);
			 break;
		 case 4:
		 case 5:
		 case 6:
			 points*=10;
			 System.out.println("Your points are " + points);
			 break;
		 case 7:
		 case 8:
		 case 9:
			 points*=50;
			 System.out.println("Your points are " + points);
			 break;
	     default:
	    	 System.out.println("Your points are not between 0 and 9!");
		 }
		input.close();
	}

}