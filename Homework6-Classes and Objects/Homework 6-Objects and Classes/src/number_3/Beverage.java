package number_3;

public class Beverage extends Stock {
	protected Boolean alcoholic;
	protected double amountInLiters;
	
	public Beverage(){
		super();
		this.alcoholic=false;
		this.amountInLiters=0;
	}
	public Beverage(double price, Boolean InStock,Boolean alcoholic, double amounInLiters){
		super(price, InStock);
		setAlcoholic(alcoholic);
		setAmountInLiters(amountInLiters);
				
	}
	public Boolean getAlcoholic() {
		return alcoholic;
	}
	public void setAlcoholic(Boolean alcoholic) {
		this.alcoholic = alcoholic;
	}
	public double getAmountInLiters() {
		return amountInLiters;
	}
	public void setAmountInLiters(double amountInLiters) {
		this.amountInLiters = amountInLiters;
	}
	public void AddStock(){
		
	}
	
}
