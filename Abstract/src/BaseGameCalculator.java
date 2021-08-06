
public abstract class BaseGameCalculator {

	/*public void hesapla(){//bu fonksiyon her class için farklýlýk gösteriyorsa diðer classlar tarafýndan override edilemeli
		//bu fonsksiyon default olamsýný istemiyorsam "abstract hale dönüþtürmeliyim
		System.out.println("Puanýnýz 100");
	}*/
	
	public abstract void hesapla();//abstarct fonk (soyuttur.Gövdesiz. Gövdesi override edilen classta yazýlýr.)
	
	public final void gameOver(){ //kim bu  fonskiyonu kullanacaksa ana classýn tanýmladýðý þekilde kullanmak zorunda final.
		System.out.println("Oyun bitti");
	}
	
}
