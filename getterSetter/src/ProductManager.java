
public class ProductManager {
	public void Add(Product pro) {
		// JDBC ile veritabana baðlantý yapýlýr daha sonra
		//System.out.println("Ürün eklendi " + pro.name);
		System.out.println("Ürün eklendi " + pro.getName());
	}
	public void Show(Product pro){
		System.out.println("Ürün fiyatý: "+ pro.getPrice());
	}

}
