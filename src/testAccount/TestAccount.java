package testaccount;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import account.Account;

public class TestAccount {
	
	 
	
	@Test
	public void testPeople(){
		
		Account test = new Account("Anderson","Doe", 2);
		
		test.firstName = "Kris";
		test.lastName = "Duff";
		test.accountNumber = 2; 
		
		assertEquals("Did not find first name",test.getNameF(), "Kris");
		assertEquals("Did not find last name",test.getNameL(), "Duff");
		assertEquals("Did not find account number",test.getAccountN(),2);
		
	} 

}
