
public class ProductManager {
	public void Add(Product pro) {
		// JDBC ile veritabana ba�lant� yap�l�r daha sonra
		//System.out.println("�r�n eklendi " + pro.name);
		System.out.println("�r�n eklendi " + pro.getName());
	}
	public void Show(Product pro){
		System.out.println("�r�n fiyat�: "+ pro.getPrice());
	}

}
