
public class CustomerManager {
	private ICustomer customer;
	
	public CustomerManager(ICustomer x){
		this.customer=x;
	}
	
	public void add(){
		//i� kodlar�
		customer.add();
	}

}
