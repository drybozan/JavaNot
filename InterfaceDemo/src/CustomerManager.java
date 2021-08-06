
public class CustomerManager {
	
	/*private Logger logger;

	public CustomerManager(Logger logger) {
		this.logger = logger;
	}*/
	//ÇOKLU LOGGER YAPMAK ÝSTERSEM
	
	private Logger[] loggers;

	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	
	}

	public void add(Customer customer){
		System.out.println("Müþteri eklendi " + customer.getFirstName()+" "+ customer.getLastName());
		
		/*FileLogger fileLogger=new FileLogger();
		fileLogger.log(customer.getFirstName() + " dosyaya loglandý");
		
		DatabaseLogger dataLogger=new DatabaseLogger();
		dataLogger.log(customer.getFirstName() + " veritabanýna loglandý");
		
		Kod kalabalýðý ve baðýmlýlýk yapmak yerine daha sade þekli yukarda polimorfizle yapýlýr
		*/
		
		//this.logger.log(customer.getFirstName()); tekli log için
		
		/* tekrar eden metot olduðu için Utils classýna taþýndý
		for(Logger logger: loggers){
			logger.log(customer.getFirstName());
		}
		*/
		Utils.runLoggers(loggers, customer.getFirstName()); //static metot, class adýyla metota ulaþtýk
	}
	
	public void delete(Customer customer ){
		System.out.println("Müþteri silindi " + customer.getFirstName()+" "+customer.getLastName());
		
		/*FileLogger fileLogger=new FileLogger();
		fileLogger.log(customer.getFirstName() + " dosyaya loglandý");
		
		DatabaseLogger dataLogger=new DatabaseLogger();
		dataLogger.log(customer.getFirstName() + " veritabanýna loglandý");
		
		Kod kalabalýðý ve baðýmlýlýk yapmak yerine daha sade þekli yukarda polimorfizle yapýlýr
		*/
		
		//this.logger.log(customer.getFirstName()); tekli log için
		
		/* tekrar eden metot olduðu için Utils classýna taþýndý
		for(Logger logger: loggers){
			logger.log(customer.getFirstName());
		}
		*/
		
		Utils.runLoggers(loggers, customer.getFirstName()); //static metot, class adýyla metota ulaþtýk
	}
}
