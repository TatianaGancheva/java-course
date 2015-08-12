package presentationTask1;

public class Company {
	protected String name;
	protected int employees;
	
	public Company(){
		this.name="";
		this.employees=0;
	}
	public Company(String name,int employees){
		this();
		setName(name);
		setEmployees(employees);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmployees() {
		return employees;
	}
	public void setEmployees(int employees) {
		this.employees = employees;
	}
	
	public String toString(){
		return String.format("%s %d",name, employees);
	}
}
