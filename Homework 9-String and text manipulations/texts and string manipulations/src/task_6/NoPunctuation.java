package task_6;
import java.io.*;
public class NoPunctuation {

	public static void main(String[] args) {
		readFile("../punctuation/punctuation.txt");
	}
	public static void readFile(String path){
		try{
			FileReader fRead=new FileReader(path);
			BufferedReader bRead=new BufferedReader(fRead);
			while(bRead.ready()){
				String line=bRead.readLine().replaceAll("[,.;!?{}()%\"-]" , " ");
				writeIntoFile(line);
			}
			bRead.close();
		}catch(Exception e){
			System.out.println("Error while reading a file.");
			System.out.println(e.getMessage());
			System.exit(0);
		}
	}
	public static void writeIntoFile(String line){
		String path="../punctuation/new file";
		try{
			FileWriter writer=new FileWriter(path);
			BufferedWriter bWriter=new BufferedWriter(writer);
			bWriter.write(line);
			bWriter.newLine();
			bWriter.close();
			System.out.println("Writing into file successfull");
			
		}catch(Exception e){
			System.out.println("Error while writing a file.");
			System.out.println(e.getMessage());
			System.exit(0);
		}
	}

}
