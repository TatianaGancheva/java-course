import java.util.Scanner;
public class PresentationTask {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in, "UTF-8");
		System.out.println("Enter your 16 numbers to fill the array: ");
		int [] [] Array = new int [4] [4];
		int rows=4;
		int cols=4;
		
		for(int i=0; i<rows; i++){
			for(int j=0; j<cols; j++){
				Array[i][j]= input.nextInt();
				
			}
		}
		for(int r=0; r<Array.length; r++){
			for(int c=0; c<Array[0].length;c++){
				System.out.printf("%d | ", Array[r][c]);
				
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		for(int i=0; i<rows; i++){
			for(int j=0; j<cols; j++){
				
				if(Array[i][j]%2!=0){
					Array[i][j]*=2;
					
				}
				
			}
		}
		for(int r=0; r<Array.length; r++){
			for(int c=0; c<Array[0].length;c++){
				System.out.printf("%d  |", Array[r][c]);
				
			}
			System.out.println();
		}
		
		
		input.close();

	}

}
