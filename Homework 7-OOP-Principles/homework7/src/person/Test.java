package person;

public class Test {

	public static void main(String[] args) {
		String[] classes={"2A", "2B", "3C", "2C", "3B"};
		Teacher teacher=new Teacher("Dora","Georgieva",25,"Mathematics");
		Teacher teacher1=new Teacher("Ivan","Ivanov",10,"Bulgarian");
		Lecturer lecturer=new Lecturer("Georgi","Georgiev",5,"TU-Sofia");
		//Lecturer lecturer1=new Lecturer("Alexander","Lalov", 2,"UNWE");
		SchoolTeacher SchTeacher=new SchoolTeacher("Tatiana", "Galinova",5
			,"English", classes);
		CollegeTeacher CollTeacher=new CollegeTeacher("NIkola", "Petrov", 15,
			"Art", "IT College-Sofia");
		Professor professor=new Professor("Maria","Lalova", 
				10,"TU-Sofia","Professor");
		Assistant asistant= new Assistant("Iva","Nikolaeva", 
			15,"UNWE","Assistant",false);
		Assistant asistant1= new Assistant("Ivailo","Nikolaev", 
				15,"UNWE","Assistant",true);
		System.out.println("The number of instances is: "+ Person.count);
		
		System.out.println("Teacher: ");
		teacher.sayHello();
		teacher.sayGoodbye();
		teacher.checkHW();
		System.out.println();
		
		System.out.println("Teacher1: ");
		teacher1.sayHello();
		teacher.sayGoodbye();
		teacher.checkHW();
		System.out.println();
		
		System.out.println("Lecturer: ");
		lecturer.sayHello();
		lecturer.checkHW();
		lecturer.checkExercise(23);
		lecturer.checkExercise(25, "Math");
		lecturer.checkExercise(56, "Bulgarian", 46);
		lecturer.lecturesProWeek();
		System.out.println();
		
		System.out.println("School teacher: ");
		SchTeacher.sayHello();
		SchTeacher.sayGoodbye();
		SchTeacher.checkHW();
		SchTeacher.printClasses();
		SchTeacher.entertain();
		System.out.println();
		
		System.out.println("College Teacher");
		CollTeacher.checkHW();
		CollTeacher.articles();
		System.out.println();
		
		System.out.println("Professor: ");
		professor.printTitleAndExperience();
		professor.checkHW();
		professor.exams();
		System.out.println();
		
		System.out.println("asistant: ");
		asistant.printInfo();
		asistant.checkHW();
		asistant.checkExams();
		System.out.println();
		
		System.out.println("asistant1:");
		asistant1.printInfo();
		asistant1.checkHW();
		asistant1.checkExams();
		
		
		
	}

}
