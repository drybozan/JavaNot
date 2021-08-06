
public class Main {

	public static void main(String[] args) {
		// ICustomer custom =new ICustomer(); interfaceler newlenemz ancak
		// referas edebilirler.
		
		ICustomer custom = new OracleCustomer();
		custom.add();
		
		ICustomer custom2 = new MysqlCustomer();
		custom2.add();
		
		//interface ile polimorfizm
		CustomerManager customerManager= new CustomerManager(new OracleCustomer());
		//customerManager.customer=new OracleCustomer(); customer deðiþkenini private yapýp constructor yaptým buna gerek kalmadý
		customerManager.add();
		//customerManager.customer=new MysqlCustomer();
		//customerManager.add();
       
		CustomerManager customerManager1= new CustomerManager(new MysqlCustomer());
		customerManager1.add();

	}

}
