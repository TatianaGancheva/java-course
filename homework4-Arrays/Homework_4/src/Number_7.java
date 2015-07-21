import java.util.Scanner;
public class Number_7 {

	public static void main(String[] args) {
		int[] Array={1,2,3,4,5,6,3,4,5,6,1,2};
		Scanner input= new Scanner(System.in, "UTF-8");
		System.out.println("Enter the number you search for: ");
		int num= input.nextInt();
		for(int i=0; i<Array.length;i++){
			if(Array[i]==num){
				i+=1;// to print the index as real, not as it is in the array
				System.out.println("The index is: " +i);
				break;
			}
		}
		input.close();
	}

}
