package person;

public class Assistant extends Lecturer {
	private boolean title;
	
	public Assistant(){
		super();
		this.title=false;
	}
	public Assistant(String firstName, String lastName, 
			int yearsExperience,String UniName,String degree,Boolean title){
		super(firstName,lastName,yearsExperience,UniName);
		isTitle(title);
	}
	public boolean getTitle() {
		return this.title;
	}
	public void isTitle(boolean title) {
		this.title = title;
	}
	public void printInfo(){
		if(title==true){
			System.out.println("My name is "+firstName+" "+lastName+" and i"
					+ " am chief assistant!");
		}else{
			System.out.println("My name is "+firstName+" "+lastName+" but i am not a "
					+ " chief assistant!");

		}
	}
	@Override
	public void checkHW(){
		System.out.println("I am assistant and i can check homeworks!");
	}
	public void checkExams(){
		System.out.println("I am Assistant and i can chech exams!");
	}
	
	

}