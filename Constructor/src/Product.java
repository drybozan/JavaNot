
public class Product {
	private int id;
	private String name;
	private String description;
	private double price;
	private String renk;
	private String kod;
	
	public Product(){
		System.out.println("Default constructor fonksiyon çalýþtý");
	}

	public Product(int id, String name, String description, double price, String renk, String kod) {
		
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.renk = renk;
		this.kod = kod;
		System.out.println(id+"\n"+name+"\n"+description+"\n"+price+"\n"+renk+"\n"+kod);
	}
	

}
