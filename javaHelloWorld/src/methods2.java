
public class methods2 {

	public static void main(String[] args) {
		String mesaj=sehirVer();
		System.out.println(mesaj);
		
		int sayi=topla(8,9);
		System.out.println(sayi);

		int toplam=topla(5,4,7,8,45,6);
		System.out.println(toplam);
	}
	public static void g�ncelle(){ //void fonksiyonu herhangi bir de�er d�nd�rmez sadece veritaban�na emir verir,kullan�cya bilgi vermez
		System.out.println("G�ncellendi");
	}
	
	public static int topla(int s1,int s2){ //kullan�cya de�er d�nd�r�r ve bilgi verir
		return s1+s2;
	}
	
	public static String sehirVer(){
		return "ankara";
	}
	
	public static int topla(int ... sayilar){ //birden fazla de�i�keni toplar,diziler i�in kulan�lr
		int toplam=0;
		for(int sayi:sayilar){
			toplam+=sayi;
			}
			return toplam;
		}
		
	}


