
public class ConstructorPractice {
	public static void main(String[] args) {
		
		Employee employee1 = new Employee();
		
		System.out.println(employee1.toString());
		
		employee1.empId = 5;
		employee1.empName = "Shubhendra";
		System.out.println(employee1.toString());

		Employee employee2 = new Employee(2, "Ramendra");
		System.out.println(employee2.toString());

	}

}
