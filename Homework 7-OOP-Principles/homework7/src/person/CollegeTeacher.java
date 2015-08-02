package person;

public class CollegeTeacher extends Teacher implements Articles {
	private String collegeName;
	
	public CollegeTeacher(){
		super();
		this.collegeName="";
	}
	public CollegeTeacher(String firstName, String lastName, int yearsExperience,
			String subject, String collegeName){
		super(firstName,lastName,yearsExperience,subject);
		setCollegeName(collegeName);
		
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public void checkHW(){
		super.checkHW();
	}
	public void articles(){
		System.out.println("I can write articles!");
	}

}
