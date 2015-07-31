package number_2;

public class SUV extends Car {
	protected  Boolean highly=true;
	
	public SUV(){
		super();
		this.highly=true;
	}
	public SUV(double price,Boolean highly){
		super(price);
		setHighly(highly);
	}
	public Boolean getHighly(){
		return highly;
	}
	public void setHighly(Boolean highly){
		this.highly=highly;
	}
	
	public static void main(String[] args) {
		

	}

}
