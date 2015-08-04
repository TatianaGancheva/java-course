package presentationTask;

public class User {
	protected String email;
	protected String password;
	
	public User(){
		this.email="";
		this.password="";
	}
	public User(String email,String password){
		setEmail(email);
		setPassword(password);
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if(email.length()<5){
			throw new IllegalArgumentException("You have to enter more than 5 characters!");
		}
		for(int i=0;i<email.length();i++){
			if(!(email.contains(".")) ||!(email.contains("@"))){
				throw new IllegalArgumentException("There must be a . and a @");
		}
		this.email = email;
	}
	
	
	
}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		boolean flagDigit= false;
		if(password.length()<6){
			throw new  IllegalArgumentException("Not long enough password.");
		}
		for(int i=0;i<password.length();i++){
			if(!(Character.isDigit(password.charAt(i)))&&!flagDigit){
				throw new  IllegalArgumentException("There must be at least one digit!");
			}
		}
		this.password = password;
	}



	
}

