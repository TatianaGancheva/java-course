package person;

public class Lecturer extends Person implements SayHello, CheckHomework {
	private String UniName;
	private final int lecturesProWeek=10;
	
	public Lecturer(){
		super();
		this.UniName="";
	}
	public Lecturer(String firstName, String lastName,int yearsExperience,String UniName){
		super(firstName,lastName,yearsExperience);
		setUniName(UniName);
	}
	public String getUniName() {
		return UniName;
	}
	public void setUniName(String uniName) {
		UniName = uniName;
	}
	public void sayHello(){
		System.out.println("Hello!");
	}
	public void checkHW(){
		System.out.println("I can check homeworks");
		
	}
	public void checkExercise(int time){
		System.out.println("The exercises will last" + time+"minutes");
	}
	public void checkExercise(int time,String name){
		System.out.println("I will check "+name+" exercise for "+time+" minutes");
	}
	public void checkExercise(int time,String name, int group){
		System.out.println("I will check "+name+" exercise from the"+group+" for "+time+" minutes");

	}
	public void lecturesProWeek(){
		System.out.println("I have "+lecturesProWeek+" lectures pro week!");
	}
	
}
