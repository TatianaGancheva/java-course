package number_3;

public abstract class Stock {
	protected double price;
	protected Boolean InStock;
	
	public Stock(){
		this.price=0;
		this.InStock=false;
	}
	public Stock(double price, Boolean InStock){
		this();
		setPrice(price);
		setInStock(InStock);
	}
	public double getPrice(){
		return price;
	}
	public void setPrice(double price){
		this.price=price;
	}
	public Boolean getInStock(){
		return InStock;
	}
	public void setInStock(Boolean InStock){
		this.InStock=InStock;
	}
//	public void createArray(){
//		Stock[]arr=new Stock[10];
//		
//			arr[0]=new Beverage(2.5, false,false,0.5);
//			arr[1]= new Desserts(3,true,320,"vafla");
//			arr[2]=new Fruits(3.50, true,"Bulgaria",3.6);
//			arr[3]= new Meat (7.8, true, "Pork", 10);
//			arr[4]= new Vegetables(10,false,"Tomatoes", "red");
//		
//	}
	
	public static void main(String[] args) {
		

	}

}