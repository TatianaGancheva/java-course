import java.util.Scanner;
public class Number_11 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in, "UTF-8");
		System.out.println("Enter rows and cols: ");
		int rows= input.nextInt();
		int cols=rows;
		int [] [] Matrix= new int [rows][cols];
		int numbers= rows*cols;
		int count=1;
		
		for(int i=0; i<cols; i++){
			for(int j=0; j<rows; j++){
				Matrix[j][i]=count;
				count++;
				if(count>numbers){
					count=1;
					break;
					
				}
				
			}
			
		}
		
		
		for(int r=0; r<Matrix.length; r++){
			for(int c=0; c<Matrix[0].length;c++){
				System.out.printf("%d  ", Matrix[r][c]);
				
			}
			System.out.println();
		}
		
		
		System.out.println();
		System.out.println();
		
		for(int i=0; i<rows; i++){
			for(int j=0; j<cols; j++){
				Matrix[i][j]=count;
				count++;
				if(count>numbers){
					break;
				}
				
			}
		}
		
		for(int r=0; r<Matrix.length; r++){
			for(int c=0; c<Matrix[0].length;c++){
				System.out.printf("%d  ", Matrix[r][c]);
				
			}
			System.out.println();
		}
		
		
		
		
		
		
		input.close();
	}
}
		
		
		
		