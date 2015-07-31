package presentatinTask2;

public class Policeman extends Employee {
	private int rang;
	public Policeman(){
		super();
		this.rang=0;
	}
	public Policeman (int hoursPerMount, double Salary, int rang){
		super(hoursPerMount, Salary);
		setRang(rang);
	}
	public int getrang(){
		return rang;
	}
	public void setRang(int rang){
		this.rang=rang;
	}
	public void SayRang(){
		System.out.printf("Work hours per mount: "+ this.hoursPerMount +" and salary: "+this.Salary );
		System.out.println();
		System.out.println("My rang is: "+ this.rang);
	}
	public static void main(String[] args){
		Policeman myPoliceman=new Policeman(23,255.3,3);
		myPoliceman.SayRang();
	}
	

}
