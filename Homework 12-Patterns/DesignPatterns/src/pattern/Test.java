package pattern;

public class Test {

	public static void main(String[] args) {
		DeviceFactory device= DeviceFactory.getInstance();
		Produce deviceA= device.getProduce("Phone");
		deviceA.produce();
		System.out.println();
		
		Produce deviceB=device.getProduce("Laptop");
		deviceB.produce();
		System.out.println();
		
		Produce deviceC=device.getProduce("Tablet");
		deviceC.produce();
		//System.out.println();
		
		

	}

}
