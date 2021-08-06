
public class Main {

	public static void main(String[] args) {

		CustomerManager customer=new CustomerManager();
		customer.databaseManager=new MysqlDatabaseManager(); //database değişkeninin nesnesini atadık
		customer.getCustomers();
		
		customer.databaseManager=new OracleDatabaseManager();
		customer.getCustomers();
	}

}
