
public class Main {

	public static void main(String[] args) {
		/*TarimKrediManager tarimKrediManager=new TarimKrediManager();
		tarimKrediManager.Hesapla();
		
		OgretmenKrediManager ogretmenKrediManager= new OgretmenKrediManager();
		ogretmenKrediManager.Hesapla();*/
		
		
		//REFERANS TİP
		KrediUI krediUI= new KrediUI();
		krediUI.KrediHesapla(new OgretmenKrediManager()); //çocuklardan nesne yapıp gönderdik
		krediUI.KrediHesapla(new TarimKrediManager());  //çocuktan nesne yapıp gönderdik

	}

}
