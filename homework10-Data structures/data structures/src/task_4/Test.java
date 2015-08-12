package task_4;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class Test {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in,"UTF-8");
		TreeMap<String,ArrayList<Book>>Treemap= new TreeMap<String,ArrayList<Book>>();		
		
		System.out.println("Enter the name of library: ");
		String name = input.nextLine();
		System.out.println("Enter adress of library: ");
		String address = input.nextLine();
		Library newL = new Library(name, address,Treemap);
		System.out.println(newL);
		
		for (int i = 0; i < 2; i++) {
			System.out.println("Enter  title of the book you want to add:");
			String title = input.nextLine();
			System.out.println("Enter the autho now :");
			String author = input.nextLine();
			System.out.println("Enter number of pages of the book:");
			int pages = input.nextInt();
			newL.addBook(title, author, pages);
		}
		System.out.println(newL);
		
		System.out.println("Enter name of the book to remove:");
		String name1 = input.next();
		newL.removeBook(name1);
		input.close();

	}

}
