package number_3;

public class Meat extends Stock {
	protected String typeMeat;
	protected double amount;
	
	public Meat(){
		super();
		this.typeMeat="";
		this.amount=0;
	}
	public Meat (double price, Boolean InStock,String typeMeat, double amount){
		super(price, InStock);
		setTypeMeat(typeMeat);
		setAmount(amount);
	}
	public String getTypeMeat() {
		return typeMeat;
	}
	public void setTypeMeat(String typeMeat) {
		this.typeMeat = typeMeat;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public static void main(String[] args) {
		
		
		
		

	}

}
