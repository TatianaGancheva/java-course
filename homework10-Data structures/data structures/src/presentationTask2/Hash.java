package presentationTask2;
import java.util.HashSet;
public class Hash {

	public static void main(String[] args) {
		Town Sofia=new Town("Sofia","Bulgaria",2000000);
		Town Pernik=new Town("Pernik","Bulgaria",565656);
		Town Paris= new Town("Paris","France", 203030);
		Town Berlin= new Town("Berlin","Germany",56999);
		Town Varna=new Town("Varna","Bulgaria",330000);
		HashSet<Town> set =new HashSet<Town>();
		set.add(Sofia);
		set.add(Pernik);
		set.add(Paris);
		set.add(Berlin);
		set.add(Varna);
		
		System.out.println(set);
		System.out.println();
		
		System.out.println(set.contains(Varna));
		System.out.println();
		
		set.remove(Varna);
		System.out.println(set);
//		for (Town element : set) {
//			System.out.print(element + " ");
//		}
//		
	}

}
