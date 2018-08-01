package testAccount;


import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.Test;

import account.Account;
import account.Service;


public class TestService {

	
	@Test
	public void testMap() {
		
		Account account  = new Account("Kris", "Duff", 3);
		Service service  = new Service();
		
		service.collectAccount(1);
		
		HashMap<Integer, Account> people = new HashMap<>();
		//people.put(1, new Account("Kris","Duff",3));

		assertEquals("Does not get.",account.getAccountN(),3);
	}

}
