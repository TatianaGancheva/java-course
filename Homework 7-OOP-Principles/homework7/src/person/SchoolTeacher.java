package person;

public class SchoolTeacher extends Teacher implements Entertaiment{
	String[] classes = new String[5];


	public SchoolTeacher(){
		super();
		setClasses(null);
	}
	public SchoolTeacher(String firstName, String lastName, int yearsExperience
			,String subject, String classes[]){
		super(firstName, lastName, yearsExperience,subject);
		setClasses(classes);
	}
	public String[] getClasses() {
		return classes;
	}
	public void setClasses(String[] classes) {
		this.classes = classes;
	}
	
	public void checkHW(){
		super.checkHW();
	}
	public void printClasses(){
		System.out.println(firstName+" "+lastName+" is teaching classes: ");
		for(int i=0;i<classes.length;i++){
			System.out.print(classes[i]+" ");
		}
		
	}
	
	public void entertain(){
		System.out.println("I will play with the kids!");
	}
}
