package Encapsulation;

public class TestEncap {

//	private long bankAccount;
//	private String accountHolderName;
//	private long mobileNumber;
//	private String address;
//	private double balence;
//	
//	private static final String BANK_NAME="SBI Bank";

	public static void main(String[] args) {

		BankAccount ba = new BankAccount();
		System.out.println(BankAccount.getBankName());

		String passCode=ba.getPassCode("SecurityKey");
		
		ba.setBankAccount(1234567, passCode);
		ba.setAccountHolderName("Suresh Sing");
		ba.setMobileNumber(9876543210l);
		ba.setAddress("Kothrud Pune");

		ba.depositFund(500);

		System.out.println("Bank account no - " + ba.getBankAccount());
		System.out.println("Bank account Holder name - " + ba.getAccountHolderName());
		System.out.println("Mobile Number - " + ba.getMobileNumber());
		System.out.println("Address - " + ba.getAddress());
		System.out.println("Your fund balence - " + ba.getBalence() + "$");

		System.out.println();

		ba.withdrawFund(200);
		System.out.println("Your fund balence - " + ba.getBalence() + "$");
		ba.withdrawFund(350);
		System.out.println("Your fund balence - " + ba.getBalence() + "$");
		ba.withdrawFund(50);
		System.out.println("Your fund balence - " + ba.getBalence() + "$");
	}
}
