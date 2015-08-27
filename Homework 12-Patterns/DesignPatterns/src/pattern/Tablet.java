package pattern;

public class Tablet extends Device implements Produce{
	
	public Tablet(String model,String brand){
		this.model=model;
		this.brand=brand;
	}

	@Override
	public void produce() {
		System.out.println("Inside Tablet::produce() method");
		print();
		
	}
	@Override
	 public void print(){
	 System.out.println("Tablet model: "+ this.model);
 	 System.out.println("Tablet brand: "+ this.brand);
	}
	
}
