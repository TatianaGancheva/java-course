package pattern;

public class DeviceFactory {
	private static DeviceFactory instance=new DeviceFactory();//singleton
	
	public static DeviceFactory getInstance(){
		return instance;
	}
	
	public Produce getProduce(String device){
		if(device==null){
			return null;
		}
		if(device.equalsIgnoreCase("Tablet")){
			return new Tablet("56","Asus");
		}else if(device.equalsIgnoreCase("Phone")){
			return new  Phone("Nexus5","LG");
		}else if(device.equalsIgnoreCase("Laptop")){
			return new Laptop("G500","Lenovo");
		}
		return null;
	}

}
