
public class IfStatment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sayi = 14;
		
		if(sayi<20){
			System.out.println("sayý 20'den küçüktür.");
		}
		else if(sayi==20){
			System.out.println("sayý 20'ye eþit");
		}
		else{
			System.out.println("sayý 20'den küçük deðildir.");
		}
		//---------Uygulama-----------//
		int sayi1=20;
		int sayi2=25;
		int sayi3=266;
		
		int enbuyuk=sayi1;
		
		if(enbuyuk<sayi2){
			enbuyuk=sayi2;
		}
		if (enbuyuk<sayi3){
			enbuyuk=sayi3;
		}
		System.out.println("En büyük sayý: " + enbuyuk);

	}

}
