package number_3;

public class Shop {
	
	private String nameShop;
	private String location;
	
	public Shop(){
		this.nameShop="Nameless";
		this.location="Somewhere";
		
	}
	public Shop(String nameShop, String location){
		setNameShop(nameShop);
		setLocation(location);
	}
	
	
	public String getNameShop() {
		return nameShop;
	}
	public void setNameShop(String nameShop) {
		this.nameShop = nameShop;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

	public void addStock(){
		System.out.println("Add a new product");
	}
	
	public void chekProductsInStock(){
		System.out.println("The product is not in stock right now");
	}
	
	
	public static void main(String[] args) {
		Stock[] arr= new Stock[10];
		
		arr[0]= new Beverage(32.5,true,true,1);
		arr[1]= new Desserts(2.3,true, 259,"Chocolate");
		arr[2]= new Fruits(3.69,false,"China", 2.5);
		arr[3]= new Meat(15.6,true,"pork",2.5);
		arr[4]= new Vegetables(5.5, true, "Tomatoe", "red");
		
		
		
		
	}

}
