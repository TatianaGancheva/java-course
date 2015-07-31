package presentatinTask2;

public class Employee {
	
	protected int hoursPerMount;
	protected double Salary;

	public Employee(){
		this.hoursPerMount = 0;
		this.Salary=0;
	
	}
	public Employee(int hoursPerMount, double Salary){

		this.hoursPerMount=hoursPerMount;
		this.Salary=Salary;
		
	}
	public int getHours(){
		return hoursPerMount;
	}
	public void setHours(int hoursPerMount){
		this.hoursPerMount=hoursPerMount;
	}
	public double getSalary(){
		return Salary;
	}
	public void setSalary (double Salary){
		this.Salary=Salary;
	}
	public void printInfo(){
		System.out.printf("Work hours per mount: "+ this.hoursPerMount +" and salary: "+this.Salary );
	}
	public static void main(String[] args){
		
		Employee myEmployee1=new Employee(23, 15.3);
		
		myEmployee1.printInfo();
		
	}

}
