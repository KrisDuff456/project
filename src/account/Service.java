package account;
import java.util.HashMap;
import org.json.JSONObject;

public class Service {

	private HashMap <Integer, Account> person = new HashMap<Integer, Account>();


	public void getAccount(Account account) {
		person.put(account.getAccountN(),account); 
	}
	
	public Account collectAccount(int id) {
		return person.get(id);
	}
	public JSONObject mapToJson() {
		
		return new JSONObject(person);
	}
	
	public int  name(String firstName) {
		int count = 0;
		
		for (Account account : person.values()) {
			if (account.getNameF().equals(firstName)) 
			count++;
		}
		return count;
}
}
 