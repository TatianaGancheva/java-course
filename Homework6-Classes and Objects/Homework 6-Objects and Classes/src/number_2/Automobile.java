package number_2;

public class Automobile extends Car{
	protected double fuelConsumption;
	
	public Automobile(){
		super();
		this.fuelConsumption=0;
		}
	public Automobile( double price,double fuelConsumption){
		super(price);
		setFuelConsumption(fuelConsumption);
	}
	public double getFuel(){
		return fuelConsumption;
		
	}
	public void setFuelConsumption(double fuelConsumption){
		this.fuelConsumption=fuelConsumption;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}