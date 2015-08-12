package presentationTask2;

public class Town {
	protected String name;
	protected String contry;
	protected int population;
	
	public Town(){
		this.name="";
		this. contry="";
		this.population=0;
	}
	public Town(String name, String contry,int population){
		this();
		setName(name);
		setContry(contry);
		setPopulation(population);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContry() {
		return contry;
	}
	public void setContry(String contry) {
		this.contry = contry;
	}
	public double getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	public String toString(){
		return String.format("%s %s %d", this.name, this.contry,this.population);
	}
}
