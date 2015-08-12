package presentationTask3;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in,"UTF-8");
		Student student=new Student("Tatiana","Gancheva",121214019);
		System.out.println(student);
		System.out.println();
		for (int i = 0; i < 5; i++) {
			student.addSubjectMark(input);

		}
		
		
		Student student1=new Student("Ivana","Ivanova", 121214155);
		System.out.println(student1);
		System.out.println();
		for (int i = 0; i < 5; i++) {
			student1.addSubjectMark(input);

		}
		
		
		
		Student student2=new Student("Emiliqn","Evtimov", 12121569);
		System.out.println(student2);
		System.out.println();
		for (int i = 0; i < 5; i++) {
			student2.addSubjectMark(input);

		}
		
	}
	
	
}
