
public class Classes {

	public static void main(String[] args) {
		CustomerManager customerManager;// = new CustomerManager(); //art�k
										// buras� hata vermez.
		CustomerManager customerManager2 = new CustomerManager();
		customerManager = customerManager2; // iki de�i�ken ayn� nesneyi
											// kullanacak

		customerManager.Add();
		customerManager.Delete();
		customerManager.Update();

		System.out.println("-------ORNEK---------------");

		DortIslem dortIslem = new DortIslem();

		int sonuc = dortIslem.topla(8, 9);
		System.out.println("Toplam: "+sonuc);
		
		int s2=dortIslem.bol(10,2);
		System.out.println("B�l�m: "+s2);
	}

}
