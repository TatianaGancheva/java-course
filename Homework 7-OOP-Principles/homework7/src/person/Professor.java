package person;

public class Professor extends Lecturer {
	private String degree;
	
	public Professor(){
		super();
		this.degree="";
		
	}
	public Professor(String firstName, String lastName, 
			int yearsExperience,String UniName,String degree){
		super(firstName,lastName,yearsExperience,UniName);
		setDegree(degree);
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	
	public void printTitleAndExperience(){
		System.out.println("My title is: "+ getDegree()+ " and i have "+ getYearsExperience()+
				" years experience");
	}
	public void checkHW(){
		System.out.println("I am a professor and i can check homeworks too!");
	}
	public void exams(){
		System.out.println("I can make exams too!");
	}

}
