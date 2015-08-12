package presentationTask1;
import java.util.ArrayList;
public class Fill {

	public static void main(String[] args) {
		Company company=new Company("T-Med",3);
		Company company1=new Company("alo-alo",5);
		Company company2=new Company("OTH",83);
		
		ArrayList<Company>list=new ArrayList<Company>();
		list.add(company);
		list.add(company1);
		list.add(company2);
		
		System.out.println("Your list in the beggining is: ");
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i) + " ");
		}
		System.out.println();
		System.out.println();
		int max=0;
		Company temp=list.get(0);
		for(int i=0;i<list.size();i++){
			if(list.get(i).getEmployees()>max){
				max=list.get(i).getEmployees();
				temp=list.get(i);
			}
		}
		list.remove(temp);
		
		Company company3=new Company("helloCompany", 56);
		Company company4=new Company("CompanyTyff", 46);
		list.add(company3);
		list.add(company4);
		System.out.println("With some new changes: ");
		System.out.println(list);
		System.out.println();
		
		
		Company company5=new Company("newCompany",1256);
		int length=0;
		int index=0;
		for(int i=0;i<list.size();i++){
			if(list.get(i).getName().length()>length){
				length=list.get(i).getName().length();
				index=i;
			}
		}
		list.set(index, company5);
		
		System.out.println("After the changes your list is: ");
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i)+" ");
		}
		//System.out.println(list);
	}

}
