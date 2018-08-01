package account;

import java.util.HashMap;

public class Service {
	
	HashMap <Integer, Account> person = new HashMap<>();
	
	public void getAccount(Account account) {
		person.put(account.getAccountN(),account); 
	}
	
	public Account collectAccount(int id) {
		return person.get(id); 
	}	 

}
