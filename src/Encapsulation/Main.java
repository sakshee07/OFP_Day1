package Encapsulation;

public class Main {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setName("sakshi");
		employee.setAge(25);
		
		System.out.println("name and age of emp is "+ employee.getName() +" & "+ employee.getAge());
	}
}
