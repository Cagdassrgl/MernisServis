package Adapters;

import java.rmi.RemoteException;

import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;
public class MernisServiceAdapter implements CustomerCheckService{
	
	@Override
	public boolean checkIfRealPerson(Customer customer) {
	   
		KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();
		
		boolean trueOrFalse = false;
		
		try {
			trueOrFalse =  proxy.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName().toUpperCase(),
					customer.getLastName().toUpperCase(), customer.getDateOfBirth().getYear());
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return trueOrFalse;
	}

}