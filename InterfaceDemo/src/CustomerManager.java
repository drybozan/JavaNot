
public class CustomerManager {
	
	/*private Logger logger;

	public CustomerManager(Logger logger) {
		this.logger = logger;
	}*/
	//�OKLU LOGGER YAPMAK �STERSEM
	
	private Logger[] loggers;

	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	
	}

	public void add(Customer customer){
		System.out.println("M��teri eklendi " + customer.getFirstName()+" "+ customer.getLastName());
		
		/*FileLogger fileLogger=new FileLogger();
		fileLogger.log(customer.getFirstName() + " dosyaya logland�");
		
		DatabaseLogger dataLogger=new DatabaseLogger();
		dataLogger.log(customer.getFirstName() + " veritaban�na logland�");
		
		Kod kalabal��� ve ba��ml�l�k yapmak yerine daha sade �ekli yukarda polimorfizle yap�l�r
		*/
		
		//this.logger.log(customer.getFirstName()); tekli log i�in
		
		/* tekrar eden metot oldu�u i�in Utils class�na ta��nd�
		for(Logger logger: loggers){
			logger.log(customer.getFirstName());
		}
		*/
		Utils.runLoggers(loggers, customer.getFirstName()); //static metot, class ad�yla metota ula�t�k
	}
	
	public void delete(Customer customer ){
		System.out.println("M��teri silindi " + customer.getFirstName()+" "+customer.getLastName());
		
		/*FileLogger fileLogger=new FileLogger();
		fileLogger.log(customer.getFirstName() + " dosyaya logland�");
		
		DatabaseLogger dataLogger=new DatabaseLogger();
		dataLogger.log(customer.getFirstName() + " veritaban�na logland�");
		
		Kod kalabal��� ve ba��ml�l�k yapmak yerine daha sade �ekli yukarda polimorfizle yap�l�r
		*/
		
		//this.logger.log(customer.getFirstName()); tekli log i�in
		
		/* tekrar eden metot oldu�u i�in Utils class�na ta��nd�
		for(Logger logger: loggers){
			logger.log(customer.getFirstName());
		}
		*/
		
		Utils.runLoggers(loggers, customer.getFirstName()); //static metot, class ad�yla metota ula�t�k
	}
}
