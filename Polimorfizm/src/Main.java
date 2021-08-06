
public class Main {

	public static void main(String[] args) {
		EmailLogger logger = new EmailLogger(); //inheritance
		logger.Log("Log mesajý"); 
		
		System.out.println("---------------------------");
		
		// BaseLogger anne sýnýf
		BaseLogger[] loggers= new BaseLogger[] {new Filelogger(),new DataBaseLogger(),new EmailLogger()}; //polimorfizm
		
		for(BaseLogger log:loggers){  //polimorfizm çatýsý altýnda tüm iþlevler çalýþtý
			log.Log("Log mesajý");
		}
		CustomerManager customerManager = new CustomerManager(new DataBaseLogger());
		customerManager.Add();
		
		CustomerManager customerManager2 = new CustomerManager(new Filelogger());
		customerManager2.Add();
		
	}

}
