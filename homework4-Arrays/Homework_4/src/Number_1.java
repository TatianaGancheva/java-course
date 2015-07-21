public class Number_1 {

	public static void main(String[] args) {
		int[] Array= {1,2,3,4,5,6,7};
		int b=0;
		for (int i=0; i<Array.length; i++){
			//System.out.println(Array[i]);
			if(Array[i]%2==0){
				
				b+=Array[i];
				
			}
			
		}
		System.out.println("sum of even= "+b);

	}

}
