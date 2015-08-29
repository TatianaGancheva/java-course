package task_1;

public class Test {

	public static void main(String[] args) {
		threads thread1=new threads();
		threads thread2=new threads();
		threads thread3=new threads();
		threads thread4=new threads();
		threads thread5=new threads();
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		
		thread1.setName("Maria");
		thread2.setName("Ivan");
		thread3.setName("Alexander");
		thread4.setName("Tatiana");
		thread5.setName("Misho");
		
		System.out.println("My name is"+ thread1.getName()+"!");
		System.out.println("My name is"+ thread2.getName()+"!");
		System.out.println("My name is"+ thread3.getName()+"!");
		System.out.println("My name is"+ thread4.getName()+"!");
		System.out.println("My name is"+ thread5.getName()+"!");
		

	}

}
