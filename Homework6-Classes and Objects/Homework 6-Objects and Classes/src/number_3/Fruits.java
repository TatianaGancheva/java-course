package number_3;

public class Fruits extends Stock {
	protected String fromCountry;
	protected double amount;
	
	public Fruits(){
		super();
		this.fromCountry="";
		this.amount=0;
	}
	public Fruits(double price, Boolean InStock, String fromCountry, double amount){
		super(price, InStock);
		setFromCountry(fromCountry);
		setAmount(amount);
	}
	public String getFromCountry() {
		return fromCountry;
	}
	public void setFromCountry(String fromCountry) {
		this.fromCountry = fromCountry;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	

}