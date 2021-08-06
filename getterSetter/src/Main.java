
public class Main {

	public static void main(String[] args) {
		Product product=new Product(); //attribute & field için
		
		product.setId(4);//product.id=4;  //set ile private _id deðiþkenine atama yaptýk
		product.setName("Laptop"); //product.name="Laptop";
		product.setDescription("Asus leptop");//product.description="asus laptop";
		product.setPrice(56789);//product.price=5478;
		
		
		ProductManager productManager=new ProductManager(); //fonksiyonlar için
		productManager.Add(product);
		productManager.Show(product);
		
		product.getId(); //get ile okuma iþlemi
		System.out.println(product.getId());

	}

}
