package account;

public class Main {

	public static void main(String[] args) {
		
		Service service = new Service();
		Account account = new Account("Kris", "Duff", 3);
		service.getAccount(account);
		System.out.println(service.name("Kris"));
		 
	} 

}
  