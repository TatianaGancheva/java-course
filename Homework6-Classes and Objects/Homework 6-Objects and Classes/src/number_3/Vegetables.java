package number_3;

public class Vegetables extends Stock {
	protected String name;
	protected String colour;
	public Vegetables(){
		super();
		this.name="";
		this.colour="";
	}
	public Vegetables(double price, Boolean InStock, String name, String colour) {
		super( price,InStock);
		setName(name);
		setColour(colour);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	
	

}
