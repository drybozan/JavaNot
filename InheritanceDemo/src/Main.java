
public class Main {

	public static void main(String[] args) {
		/*TarimKrediManager tarimKrediManager=new TarimKrediManager();
		tarimKrediManager.Hesapla();
		
		OgretmenKrediManager ogretmenKrediManager= new OgretmenKrediManager();
		ogretmenKrediManager.Hesapla();*/
		
		
		//REFERANS T�P
		KrediUI krediUI= new KrediUI();
		krediUI.KrediHesapla(new OgretmenKrediManager()); //�ocuklardan nesne yap�p g�nderdik
		krediUI.KrediHesapla(new TarimKrediManager());  //�ocuktan nesne yap�p g�nderdik

	}

}
