package methods_and_recursion;

public class Number_5 {

public static void main(String[] args) {
		
		symetricNums();
	}
	
	public static void symetricNums(){
		
		for(int i=10;i<=999;i++){
			int r=i;
			isSymmetric(r);
			if(isSymmetric(r)==true){
				System.out.print(r+" ");
				}
			

			}
		
			
		}	
	public static boolean isSymmetric(int number) {
		  String val = String.valueOf(number); // Get the string.
		  StringBuilder sb = new StringBuilder(val);
		  return (val.equals(sb.reverse().toString())); // if the reverse is the same...
		}
	

}
