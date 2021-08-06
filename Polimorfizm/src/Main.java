
public class Main {

	public static void main(String[] args) {
		EmailLogger logger = new EmailLogger(); //inheritance
		logger.Log("Log mesaj�"); 
		
		System.out.println("---------------------------");
		
		// BaseLogger anne s�n�f
		BaseLogger[] loggers= new BaseLogger[] {new Filelogger(),new DataBaseLogger(),new EmailLogger()}; //polimorfizm
		
		for(BaseLogger log:loggers){  //polimorfizm �at�s� alt�nda t�m i�levler �al��t�
			log.Log("Log mesaj�");
		}
		CustomerManager customerManager = new CustomerManager(new DataBaseLogger());
		customerManager.Add();
		
		CustomerManager customerManager2 = new CustomerManager(new Filelogger());
		customerManager2.Add();
		
	}

}
