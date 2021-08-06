
public class methods2 {

	public static void main(String[] args) {
		String mesaj=sehirVer();
		System.out.println(mesaj);
		
		int sayi=topla(8,9);
		System.out.println(sayi);

		int toplam=topla(5,4,7,8,45,6);
		System.out.println(toplam);
	}
	public static void güncelle(){ //void fonksiyonu herhangi bir deðer döndürmez sadece veritabanýna emir verir,kullanýcya bilgi vermez
		System.out.println("Güncellendi");
	}
	
	public static int topla(int s1,int s2){ //kullanýcya deðer döndürür ve bilgi verir
		return s1+s2;
	}
	
	public static String sehirVer(){
		return "ankara";
	}
	
	public static int topla(int ... sayilar){ //birden fazla deðiþkeni toplar,diziler için kulanýlr
		int toplam=0;
		for(int sayi:sayilar){
			toplam+=sayi;
			}
			return toplam;
		}
		
	}


