import java.util.Scanner;
public class Number_2{

    public static void main(String[] args){
    	Scanner input= new Scanner(System.in, "UTF-8");
    	System.out.println("Enter length of array: ");
    	int L= input.nextInt();
    
        int[] fibMembers = buildFibArray(L);
        printFibArray(fibMembers);
        input.close();
    }

    private static void printFibArray(int[] fibMembers){
    
        for (int i = 0; i < fibMembers.length; i++){
        	
        
            System.out.print(fibMembers.length+1-(fibMembers.length-i));
            System.out.print(": ");
            System.out.print(fibMembers[i]);
            
            System.out.println("");
        }
    }

    private static int[] buildFibArray(int maxIndex){
    
        int[] fibMembers = new int[maxIndex];

        if (maxIndex > 0){
        
            fibMembers[0] = 1;
            if (maxIndex > 1) {
           
                fibMembers[1] = 1;

                for (int i = 2; i < fibMembers.length; i++){
                
                    fibMembers[i] = fibMembers[i-2] + fibMembers[i-1];
                }
            }
        }
        return fibMembers;
    }
    
    
}