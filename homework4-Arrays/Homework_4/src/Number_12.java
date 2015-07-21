
import java.util.Scanner;
 
public class Number_12{
 
	 public static void main(String[] args) {
         print2dArray(getSpiralArray(1));
 }
  public static int[][] getSpiralArray(int dim) {
         Scanner input = new Scanner(System.in,"UTF-8");
         System.out.println("Enter the dim of the matrix:");
         dim=input.nextInt();
        
        
        
         int[][] matrix=new int[dim][dim];
         int numberofsquares=(int) Math.ceil((dim)/2.0);
         int size=dim;
         int curnum=1;
         int j;
          for (int i = 0; i < numberofsquares; i++) {
               // do top side
               for (j = 0; j < size; j++) {
                   matrix[i][i + j] = curnum++;
               }
          
               // do right side
               for (j = 1; j < size; j++) {
                   matrix[i + j][dim - 1 - i] = curnum++;
               }
          
               // do bottom side
               for (j = size - 2; j > -1; j--) {
                   matrix[dim - 1 - i][i + j] = curnum++;
               }
          
               // do left side
               for (j = size - 2; j > 0; j--) {
                   matrix[i + j][i] = curnum++;
               }
          
               size -= 2;
             }
          input.close();
          return matrix;
          
 }
          public static void print2dArray(int[][] array) {
                     for (int[] dim : array) {
                       for (int elem : dim) {
                         System.out.printf("%3d", elem);
                       }
                       System.out.println();
        
        
        
 }
}
}