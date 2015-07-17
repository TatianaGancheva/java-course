import java.util.Scanner;
public class SwitchFromPresentation2 {
 
        public static void main(String[] args) {
                Scanner input = new Scanner(System.in,"UTF-8");
                System.out.println("Insert number");
                int num=input.nextInt();
               
                switch(num){
                case 1:
                case 2:
                case 3:
                case 4:
                case 5: if(num%2==0){
                        System.out.println("The number is even");
                }else{
                        System.out.println("The number is uneven");
                }; break;
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15: if(num%3==0){
                        System.out.println("The number " + num + " /3 has no residue");
                }else {
                        System.out.println("The number " + num + " /3 has  residue");
                                        }; break;
                default:
                if(num<0){
                        System.out.println("The number is negative");
                }else if(num>0){
                        System.out.println("The number is positive");
                }else{
                        System.out.println("The number is 0");
                }break;
               
                
                } input.close();
                 
        }
 
}