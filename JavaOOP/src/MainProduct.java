

public class MainProduct {

	public static void main(String[] args) {
		Product product=new Product();
		product.id=4;
		product.name="Laptop";
		product.description="asus laptop";
		product.price=5478;
		
		System.out.println(product.name);
		
		ProductManager productManager=new ProductManager();
		productManager.Add(product);

	}

}
