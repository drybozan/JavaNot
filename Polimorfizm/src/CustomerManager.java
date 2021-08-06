
public class CustomerManager {
	private BaseLogger logger;
	
	public CustomerManager(BaseLogger log) { //BaseLogger ,miras verdiði classlarýn referansýný tutuyor tüm çocuklarý gelip çalýþtýrabilir.
		// TODO Auto-generated constructor stub
		this.logger=log;
	}
	public void Add(){
		System.out.println("Müþteri eklendi");
		this.logger.Log("log mesajý");
	}

}
