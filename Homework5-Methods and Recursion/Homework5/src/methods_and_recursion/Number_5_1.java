package methods_and_recursion;

public class Number_5_1 {

public static void main(String[] args) {
		
		symetricNums();
	}
	
	public static void symetricNums(){
		
		for(int i=10;i<=999;i++){
			int r=i;
			printSymetric(r);
			if(printSymetric(r)==true){
				System.out.println(r);
	        }
		 }
			
	}

	public static boolean printSymetric(int number){
		if (number == 0) return true;
        else if (number < 0) return false;
        int DEG_10 = (int)(Math.pow(10, (int)Math.log10(number)));
        //System.out.print(DEG_10+" d" );

        while (number > 0){
            int dStart = number / DEG_10;
            int dEnd = number % 10;
            if (dStart != dEnd) return false;
            number = (number - dStart * DEG_10 - dEnd) / 10;
            DEG_10 /= 100;
        }
        
        return true;
        
		
	}
}
