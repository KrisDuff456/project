package account;

public class Account {

	private String firstName;
	private String lastName;
	private int accountNumber;
	
	public Account(String nameF,String nameL,int accountN) {
		this.firstName = nameF; 
		this.lastName = nameL;
		this.accountNumber = accountN;
	}
		
		public String getNameF(){
			return firstName;
		}
		public String getNameL(){
			return lastName;
		}
		public int getAccountN(){
			return accountNumber;
		}	
	}
