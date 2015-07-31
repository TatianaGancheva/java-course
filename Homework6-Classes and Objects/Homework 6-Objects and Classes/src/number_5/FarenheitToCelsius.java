package number_5;
import java.util.Scanner;
public class FarenheitToCelsius {
	private double Celsius;
	
	public FarenheitToCelsius(){
		this.Celsius=0;
	}
	public FarenheitToCelsius(double Celsius){
		setCelsius(Celsius);
		
	}
	
	public double getCelsius() {
		return Celsius;
	}
	public void setCelsius(double celsius) {
		Celsius = celsius;
	}
	public double Convert(double Celsuis){
		double Farenheit= (((Celsius*9)/5)+32);
		return Farenheit;
		
	}
	public void printResult(){
		
		System.out.println("The temperature "+ this.Celsius+" celsuis is "+ Convert( Celsius)+" in Farenheit.");
	}
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in, "UTF-8");
		System.out.println("Enter temperature in celsius to convert in farenheit: ");
		double celsius= input.nextDouble();
		FarenheitToCelsius temperature= new FarenheitToCelsius(celsius);
		temperature.printResult();
		input.close();

	}

}
