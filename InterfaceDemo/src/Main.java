
public class Main {
public static void main(String[] args){
	
	/*CustomerManager customerManager = new CustomerManager(new FileLogger());
	CustomerManager customerManager1 = new CustomerManager(new SmsLogger());
	CustomerManager customerManager2 = new CustomerManager(new EmailLogger());
	
	Customer derya = new Customer(2,"derya","bozan");
	customerManager.add(derya);
	
	Customer ali = new Customer(5,"ali","kaya");
	customerManager1.add(ali);
	
	Customer ufuk = new Customer(10,"ufuk","bozan");
	customerManager2.add(ufuk);
	
	*/
	
	//çoklu loglama için
	Logger[] loggers = {new FileLogger(),new DatabaseLogger(),new SmsLogger()};
	
	CustomerManager customerManager = new CustomerManager(loggers);
	CustomerManager customerManager1 = new CustomerManager(loggers);
	CustomerManager customerManager2 = new CustomerManager(loggers);
	
	Customer derya = new Customer(2,"derya","bozan");
	customerManager.add(derya);
	
	Customer ali = new Customer(5,"ali","kaya");
	customerManager1.add(ali);
	
	Customer ufuk = new Customer(10,"ufuk","bozan");
	customerManager2.add(ufuk);
}
}
