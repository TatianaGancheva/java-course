package number_2;

public class arr  {
	
	SUV mySUV= new SUV();
	
	public static void fillArray(Car[] arr){
		
		//Car[]arr= new Car[10];
		for(int i=0;i<(arr.length)/2;i++){
			int price=32*(i+12);
			double fuel=5.2*i;
			
			Automobile newAuto= new Automobile(price,fuel);
			arr[i]= newAuto;
			
		}
		for(int i=5;i<arr.length;i++){
			int price=323*i;
			
			Boolean [] hight={true, false,true, false,true};
			Boolean high=hight[i-5];
			SUV newSUV= new SUV(price,high);
			arr[i]=newSUV;
		}
	}
	
	public static void SortByPrice(Car[] arr){
		
		
		for(int i=0;i<arr.length;i++){
			Boolean flag=false;
			for(int k=1; k<(arr.length-1-i);i++){
				if(arr[k-1].getPrice() > arr[k].getPrice()){
					double temp=arr[k-1].getPrice();
					arr[k-1].setPrice(arr[k].getPrice());
					arr[k].setPrice(temp);
					flag=true;
				}
			}
			if(!flag){
				break;
			}
		}//close for
		
		
	}//close method

	
	public static void print(Car[] arrPrint){
		for(Car car: arrPrint){
			System.out.println(car.getPrice());
		}
		
	}
	public static void main(String[] args) {
		Car[]arr= new Car[10];
		fillArray(arr);
		SortByPrice(arr);
		print(arr);
		
		
		
		
	}
}
