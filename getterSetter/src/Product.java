
public class Product {
	// attribute | field
	private int id;
	private String name;
	private String description;
	private double price;
	private String renk;
	private String kod;

	// getter ve setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id; // this.id Product classýnýn id si demek.
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public String getKod() {
		return kod;
	}

	public void setKod(String kod) {
		this.kod = kod;
	}
}
