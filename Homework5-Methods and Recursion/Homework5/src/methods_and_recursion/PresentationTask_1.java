package methods_and_recursion;

public class PresentationTask_1 {

	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5,6,7};
		arrBackwardsPrint(arr);
		String word= "BMW";
		printStringBackwards(word);

	}
	
	public static void arrBackwardsPrint( int [] arrParameter){
		int length= arrParameter. length;
		System.out.println(length);
		for(int i=length-1; i>=arrParameter[0];i--){
			System.out.println(i);
		}

	}
	 static void printStringBackwards(String strParameter){
		 int length= strParameter.length();
		 for(int i=length-1; i>=0;i--){
			 System.out.print(strParameter.charAt(i));
		 }
	 }


}
