
public class IfStatment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sayi = 14;
		
		if(sayi<20){
			System.out.println("say� 20'den k���kt�r.");
		}
		else if(sayi==20){
			System.out.println("say� 20'ye e�it");
		}
		else{
			System.out.println("say� 20'den k���k de�ildir.");
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
		System.out.println("En b�y�k say�: " + enbuyuk);

	}

}
