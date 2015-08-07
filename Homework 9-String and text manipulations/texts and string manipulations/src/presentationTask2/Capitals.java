package presentationTask2;
import java.io.*;
//import java.io.FileReader;
import java.util.Scanner;
public class Capitals {

	public static void main(String[] args) {
		String filePath="../contries/countries.txt";
		Scanner input= new Scanner(System.in,"UTF-8");
		readFile(filePath,input);

	}
	public static void readFile(String filePath,Scanner input){
		try{
			FileReader fileReader=new FileReader(filePath);
			BufferedReader reader =new BufferedReader(fileReader);
			while(reader.ready()){
				String line= reader.readLine();
				System.out.println("Enter the caital of : "+line);
				
					writeIntoFile(input);
			
				
			}
			reader.close();
			System.out.println("The capitals are in the file!");
			
		}catch(Exception e){
			System.out.println("Error reading file");
			System.out.println(e.getMessage());
			System.exit(0);
		}
	}
	public static void writeIntoFile(Scanner input){
		
		String filePath="../contries/capitals.txt";
		try{
			
			FileWriter stream= new FileWriter(filePath);
			BufferedWriter writer=new BufferedWriter(stream);
			//for(int i=0;i<=5;i++){
				String capital=input.nextLine();
				writer.write(capital);
				writer.newLine();
			//}
				
				writer.close();
			
			
			
		}catch(Exception e){
			System.out.println("Error while writing a file.");
			System.out.println(e.getMessage());
			System.exit(0);
			
		}
		
	}
	

}