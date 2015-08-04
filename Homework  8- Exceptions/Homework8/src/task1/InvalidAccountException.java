package task1;

public class InvalidAccountException extends Exception {
	public InvalidAccountException(){
		super();
	}
	
	 public InvalidAccountException(String message) {
        super(message);
     }
}
