package presentationTask3;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class Student {
	
	protected String firstName;
	protected String lastName;
	protected int number;
	private HashMap<String, List<Double>> subjects = new HashMap<String, List<Double>>();
	public Student(){
		this.firstName="";
		this.lastName="";
		this.number=0;
	}
	public Student(String firstName, String lastName, int number){
		//this();
		setFirstName(firstName);
		setLastName(lastName);
		setNumber(number);
		
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
public void addSubjectMark(Scanner inputs){
		System.out.println();
		System.out.print("Enter subject: ");
		String subject = inputs.nextLine();
		
		ArrayList<Double> marks = new ArrayList<Double>();
		System.out.printf("How many marks to subject: " + subject + " ? : ");
		
		int count = inputs.nextInt();
		
		for(int i = 0; i < count ; i++){
			
			System.out.print("Enter mark: ");
			
			double mark=inputs.nextDouble();
			inputs.nextLine();
			marks.add(mark);
			
		}
		
		subjects.put(subject, marks);
		calculateAvarageMark( subject);
	}
public void calculateAvarageMark(String subject){
	double sum = 0;
	List<Double> marks;
	
	if(subjects.containsKey(subject)){
		marks = subjects.get(subject);
		
		for(double mark : marks){
			sum += mark;
		}
		
		System.out.printf("Average mark of student %s for subject %s is %f", this.lastName, subject, (sum/marks.size()));
	}
	
	
	
}

	@Override
	public String toString(){
		return String.format("%s %s %s" ,this.firstName,this.lastName,this.number );
	}


	@Override
	public int hashCode() {
		return this.subjects.hashCode();
	}

	
	
}
