
public class Arrays {

	public static void main(String[] args) {

		String[] ogrenciler = new String[3];
		ogrenciler[0] = "engin";
		ogrenciler[1] = "salih";
		ogrenciler[2] = "derya";

		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}

		// ikinci yöntem
		for (String ogrenci : ogrenciler) { // ogrenciler dizisindeki her
											// elemaný ogrenci deðiþkenine okut
											// ve yaz
			System.out.println(ogrenci);
		}

		System.out.println("--------------------------------------------");

		double[] mylist = { 1.2, 1.3, 1.4, 1.5, 1.6 };
		double total = 0;
		double max = mylist[0];

		for (double number : mylist) {
			if (max < number)
				max = number;
			total = total + number;
			System.out.println(number);

		}
		System.out.println("Toplam: " + total);
		System.out.println("En büyük: " + max);
		
		System.out.println("--------------------------------------------");
		//ÇOK BOYUTLU DÝZÝ//
		
		String[][] sehirler=new String[3][3];
		
		sehirler[0][0]="istanbul";
		sehirler[0][1]="yalova";
		sehirler[0][2]="edirne";
		sehirler[1][0]="rize";
		sehirler[1][1]="trabzon";
		sehirler[1][2]="ordu";
		sehirler[2][0]="aydýn";
		sehirler[2][1]="izmir";
		sehirler[2][2]="muðla";
		
		for(int i=0;i<=2;i++){
			for(int j=0;j<=2;j++){
				System.out.println(sehirler[i][j]);
			}
				
		}
		System.out.println("--------------------------------------------");
		
		String mesaj="Bugün hava çok güzel.";
		
		System.out.println(mesaj);
		System.out.println("Eleman sayýsý: " +mesaj.length());
		System.out.println("5.karekter: "+mesaj.charAt(4)); //5.karekter: n
		System.out.println(mesaj.concat(" Yaþasýn." )); //Bugün hava çok güzel. Yaþasýn.
		System.out.println(mesaj); //Bugün hava çok güzel.
		System.out.println(mesaj.startsWith("B")); //true
		System.out.println(mesaj.endsWith("."));  //true
		
		char[] karekterler=new char[5];
		mesaj.getChars(0,5, karekterler, 0);
		System.out.println(karekterler); //Bugün
		
		System.out.println(mesaj.indexOf('a')); //aramaya baþtan baþlar cvp 7
		System.out.println(mesaj.lastIndexOf('e'));  //aramaya sondan baþlar  cvp 18
		
		System.out.println(mesaj.replace(' ', '-')); //Bugün-hava-çok-güzel.
		System.out.println(mesaj.substring(2)); //gün hava çok güzel.
		System.out.println(mesaj.substring(2,5)); //gün
		
		for(String kelime:mesaj.split("a")){
			System.out.println(kelime);
		}/*Bugün h
v
 çok güzel.*/
		
		

	}
	
	

}
