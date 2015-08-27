package pattern;

public class Phone extends Device implements Produce {
	public Phone(String model,String brand){
		this.model=model;
		this.brand=brand;
	}
	
	@Override
	public void print(){
		System.out.println("Phone model:"+this.model);
	  	System.out.println("Phone brand:"+this.brand);
	}
	
	@Override
	public void produce(){
		System.out.println("Inside phone::produce()method");
		print();
	}
	
}
