package person;

public class Teacher extends Person implements SayHello,CheckHomework {
	
	private String subject;
	
	public Teacher(){
		super();
		this.subject="";
	}
	public Teacher(String firstName, String lastName,int yearsExperience, String subject){
		super(firstName, lastName,yearsExperience);
		setSubject(subject);
		
	}
	
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public void sayGoodbye(){
		System.out.println("Goodbye people,have a nice day!");
	}
	
	@Override
	public void sayHello(){
		System.out.println("Hello everyone!");
	}
	@Override
	public void checkHW(){
		System.out.println("I am checking homeworks");
	}
	
	
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}
