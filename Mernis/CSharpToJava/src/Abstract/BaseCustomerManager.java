package Abstract;

import Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {
	
	@Override
	public void save(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("Veritabanýna kaydedildi: "+ customer.getFirstName());
	}

}
