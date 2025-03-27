package ThisAndSuperKey;

public class TestAcc {

	int age = 10;

	public static void main(String[] args) {

		BankAccount ba = new BankAccount();

		ba.setAccData("Saving", 1001, "Suresh Sing", 100);

		ba.getAccDetails();
//
//		BankAccount ba2 = new BankAccount();
//		ba2.accountNumber=1002;
//		ba2.bankAccountType="Saving";
//		ba2.balence=200;
//		ba2.name="Ramesh Sing";
//
//		ba2.setAccData("Current", 1002, "Ramesh Sing", 200);
//
//		ba2.getAccDetails();
//
//		BankAccount baObj = new BankAccount();
//		BankAccount baObj2 = ba.m3();
//
//		System.out.println(baObj2.name);

		// --------------------------------------
		System.out.println();

		BankAccount bAcc = new BankAccount(12345);

		bAcc.getAccDetails();

		// --------------------------------------

		SuperDemo sp = new SuperDemo(12345, "Suresh");
		sp.demo();

	}
}
