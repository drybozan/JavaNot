
public class Arrays {

	public static void main(String[] args) {

		String[] ogrenciler = new String[3];
		ogrenciler[0] = "engin";
		ogrenciler[1] = "salih";
		ogrenciler[2] = "derya";

		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}

		// ikinci y�ntem
		for (String ogrenci : ogrenciler) { // ogrenciler dizisindeki her
											// eleman� ogrenci de�i�kenine okut
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
		System.out.println("En b�y�k: " + max);
		
		System.out.println("--------------------------------------------");
		//�OK BOYUTLU D�Z�//
		
		String[][] sehirler=new String[3][3];
		
		sehirler[0][0]="istanbul";
		sehirler[0][1]="yalova";
		sehirler[0][2]="edirne";
		sehirler[1][0]="rize";
		sehirler[1][1]="trabzon";
		sehirler[1][2]="ordu";
		sehirler[2][0]="ayd�n";
		sehirler[2][1]="izmir";
		sehirler[2][2]="mu�la";
		
		for(int i=0;i<=2;i++){
			for(int j=0;j<=2;j++){
				System.out.println(sehirler[i][j]);
			}
				
		}
		System.out.println("--------------------------------------------");
		
		String mesaj="Bug�n hava �ok g�zel.";
		
		System.out.println(mesaj);
		System.out.println("Eleman say�s�: " +mesaj.length());
		System.out.println("5.karekter: "+mesaj.charAt(4)); //5.karekter: n
		System.out.println(mesaj.concat(" Ya�as�n." )); //Bug�n hava �ok g�zel. Ya�as�n.
		System.out.println(mesaj); //Bug�n hava �ok g�zel.
		System.out.println(mesaj.startsWith("B")); //true
		System.out.println(mesaj.endsWith("."));  //true
		
		char[] karekterler=new char[5];
		mesaj.getChars(0,5, karekterler, 0);
		System.out.println(karekterler); //Bug�n
		
		System.out.println(mesaj.indexOf('a')); //aramaya ba�tan ba�lar cvp 7
		System.out.println(mesaj.lastIndexOf('e'));  //aramaya sondan ba�lar  cvp 18
		
		System.out.println(mesaj.replace(' ', '-')); //Bug�n-hava-�ok-g�zel.
		System.out.println(mesaj.substring(2)); //g�n hava �ok g�zel.
		System.out.println(mesaj.substring(2,5)); //g�n
		
		for(String kelime:mesaj.split("a")){
			System.out.println(kelime);
		}/*Bug�n h
v
 �ok g�zel.*/
		
		

	}
	
	

}
