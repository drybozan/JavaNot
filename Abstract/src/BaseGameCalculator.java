
public abstract class BaseGameCalculator {

	/*public void hesapla(){//bu fonksiyon her class i�in farkl�l�k g�steriyorsa di�er classlar taraf�ndan override edilemeli
		//bu fonsksiyon default olams�n� istemiyorsam "abstract hale d�n��t�rmeliyim
		System.out.println("Puan�n�z 100");
	}*/
	
	public abstract void hesapla();//abstarct fonk (soyuttur.G�vdesiz. G�vdesi override edilen classta yaz�l�r.)
	
	public final void gameOver(){ //kim bu  fonskiyonu kullanacaksa ana class�n tan�mlad��� �ekilde kullanmak zorunda final.
		System.out.println("Oyun bitti");
	}
	
}
