package threads;

public class numbers extends Thread {
	public void run(){
		for(int i=5000000;i<=0;i--){
			System.out.print(i+" ");
		}
	}
}
