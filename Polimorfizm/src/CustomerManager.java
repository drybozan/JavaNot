
public class CustomerManager {
	private BaseLogger logger;
	
	public CustomerManager(BaseLogger log) { //BaseLogger ,miras verdi�i classlar�n referans�n� tutuyor t�m �ocuklar� gelip �al��t�rabilir.
		// TODO Auto-generated constructor stub
		this.logger=log;
	}
	public void Add(){
		System.out.println("M��teri eklendi");
		this.logger.Log("log mesaj�");
	}

}
