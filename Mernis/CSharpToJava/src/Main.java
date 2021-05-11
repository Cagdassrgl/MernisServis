import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concretes.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		
		baseCustomerManager.save(new Customer(1,"�a�da�","Sar�gil",LocalDate.of(1999, 7, 16),"17012782862"));
		baseCustomerManager.save(new Customer(2, "�zg�r", "Sar�gil", LocalDate.of(2004, 7, 19), "13006209056"));

	}

}
