package presentatinTask2;

public class Doctor extends Employee {
	private int dayShifts;
	private int nightShifts;
	
	public Doctor(){
		super();
		this.dayShifts=0;
		this.nightShifts=0;
	}
	public Doctor(int hoursPerMount, double Salary,int dayShifts, int nightShifts ){
		super(hoursPerMount,Salary);
		setDayShifts(dayShifts);
		setNightShifts(nightShifts);
	}
	public int getDayShifts(){
		return dayShifts;
	}
	public void setDayShifts(int dayShifts){
		this.dayShifts=dayShifts;
	}
	public int getNightShifts(){
		return nightShifts;
	}
	public void setNightShifts(int nightShifts){
		this.nightShifts=nightShifts;
	}
	public void printShifts(){
		System.out.printf("Work hours per mount: "+ this.hoursPerMount +" and salary: "+this.Salary );
		System.out.println();
		System.out.printf("Day shifts: %d\nNight shifts: %d", this.dayShifts, this.nightShifts);
	}
	

	public static void main(String[] args) {
		Doctor MyDoctor= new Doctor(56,3569.36,26,36);
		MyDoctor.printShifts();
		

	}

}
