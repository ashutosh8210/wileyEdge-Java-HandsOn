
public class BankMainApp {

	public static void main(String[] args) {
		
		
		BankAccount account1=new BankAccount(10001, "Ashutosh", 500,AccountType.SAVING);
		BankAccount account2=new BankAccount(10002, "Saurav", 100,AccountType.CURRENT);
		BankAccount account3=new BankAccount(10003, "Sidharth", 700,AccountType.CURRENT);
		BankAccount account4=new BankAccount(10004, "Lingraj", 6000,AccountType.SAVING);
		BankAccount account5=new BankAccount(10005, "Manab", 400,AccountType.SAVING);
		System.out.println(BankAccount.totalBalance);
		
		account1.depositAmount(20000);
		System.out.println("=========================");
		account3.depositAmount(250000);
		System.out.println("=========================");
		account2.depositAmount(800000);
		System.out.println("=========================");
		account5.depositAmount(25000);
		System.out.println("=========================");
		account4.depositAmount(62458);
		System.out.println("=========================");
		account3.withdrawAmount(60000);
		System.out.println("=========================");
		account1.withdrawAmount(300000);
		System.out.println("=========================");
		account4.withdrawAmount(5000);
		
	}

}
