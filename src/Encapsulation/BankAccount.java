package Encapsulation;

public class BankAccount {

	// Encapsulation -
	// is an oops concept,
	// is wrapping data [variables] and code [methods] in single unite
	// control over the data > who and how the data can be accessed
	// data security

	// fully encapsulated class
	// all data members [variables] should be declared as private
	// to access / set data to variables we should create public getter and setter
	// methods

	// POM class is an encapsulated
	// POJO classes - data accessibility

	private long bankAccount;
	private String accountHolderName;
	private long mobileNumber;
	private String address;
	private double balence;

	private static final String BANK_NAME = "SBI Bank";

	private String passcode = "Admin";

	public String getPassCode(String authKey) {
		if (authKey.equals("SecurityKey")) {
			return passcode;
		}
		return null;
	}

	public static String getBankName() {
		return BANK_NAME;
	}

	public long getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(long bankAccount, String passCode) {
		if (passCode == "Admin")
			this.bankAccount = bankAccount;
		else
			System.err.println("!!!---- Account number is not set due to invalid passcode ----!!!");
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getBalence() {
		return balence;
	}

//	public void setBalence(double balence) {
//		this.balence = balence;
//	}

	// ------------------------------ Transaction / business logic

	// withdraw
	// Deposit
	// Control over the data
	public void depositFund(double fund) {
		balence += fund;
	}

	public void withdrawFund(double fund) {
		if (balence > fund && balence - fund >= 100) {
			balence -= fund;
			System.out.println(fund + "$ fund withdraw successful");
		} else {
			System.err.println(fund + "$ withdraw request is declined!!!");
			System.err.println("Insuficent balence / minimum 100 $ shoulb be there");
		}
	}

}
