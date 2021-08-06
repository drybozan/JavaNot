
public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer();
		Employee employee = new Employee();
		
		customer.age=8;
		customer.id=1;
		customer.name="orhan";
		customer.email="avaba@gmail.com";
		
		
		employee.age=9;
		employee.id=1;
		employee.name="orhan";
		employee.salary=89567;
		
		customer.Add();
		customer.List();
		
		employee.Add();
		employee.List();
		employee.BestEmployee();

	}

}
