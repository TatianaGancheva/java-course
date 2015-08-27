package pattern;

public class Laptop extends Device implements Produce {
	public Laptop(String model,String brand){
		this.model=model;
		this.brand=brand;
	}
	
	@Override
	 public void print(){
		
	System.out.println("Laptop model:"+this.model);
   	 System.out.println("Laptop brand:"+this.brand);
	}

	@Override
	public void produce() {
		System.out.println("Inside Laptop::produce() method");
		print();
		
	}
}
