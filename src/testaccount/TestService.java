package testaccount;


import static org.junit.Assert.*;

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
		
		HashMap<Integer, Account> people = new HashMap<Integer, Account>();
		people.put(1, new Account("Kris","Duff",3));

		assertEquals("Does not get.",account.getAccountN(),3);
	}
	@Test
	public void testJsonMap() {
		
		Account account = new Account("kris", "Duff", 3);
		Service service = new Service();
		service.getAccount(account);
		
		HashMap<Integer, Account> people = new HashMap<Integer, Account>();
		people.put(1, new Account("Kris","Duff",3));
		
		assertNotNull("Is Null",service.mapToJson());
	}
	@SuppressWarnings("unlikely-arg-type")
	@Test
	public void testAllAccounts(){
		Service s = new Service();
		Account a = new Account("Kris", "duff", 1);
		s.getAccount(a);
		
		HashMap<Integer, Account> people = new HashMap<Integer, Account>();
		people.put(1, new Account("kris","Duff",2));
		people.put(2, new Account("john","Smith",3));
		
		assertEquals("Did not get account name",a.getNameF().equals(s.name("Kris")),"Kris");
	
	}

}
