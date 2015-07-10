import java.util.Scanner;
public class Number_3 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in,"UTF-8");
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter first Name: ");
		String name=input.nextLine();
		System.out.println("Enter last name: ");
		String Lname= input.nextLine();
		System.out.println("Enter age: ");
		byte age=input.nextByte();
		System.out.println("Enter gender: ");
		char gender=reader.next().charAt(0);
		System.out.println("Enter EGN: ");
		long EGN=input.nextLong();
		System.out.println("Enter phone: ");
		int Phone=input.nextInt();
		
		System.out.println("First name: " +name);
		System.out.println("Last name: "+Lname);
		System.out.println("Age:  "+age);
		System.out.println("Gender:  "+gender);
		System.out.println("EGN:  "+EGN);
		System.out.println("Phone number: "+Phone);
		
		input.close();
		reader.close();
		
		
		

	}

}
