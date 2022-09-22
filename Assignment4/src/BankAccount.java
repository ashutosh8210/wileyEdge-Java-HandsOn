
public class BankAccount {
	static  double totalBalance;
	private long accountId;
	private String accountHolderName;
	private double openingBalance;
	private double currentBalance;
	AccountType accountType;
	
	public BankAccount(long accountId, String accountHolderName, double openingBalance,AccountType accountType) {
		
		
		this.accountId = accountId;
		this.accountHolderName = accountHolderName;
		this.accountType=accountType;
		this.currentBalance=openingBalance;
		this.openingBalance=openingBalance;
		System.out.println("Account Created");
		displayAccountDetails();
		checkOpeningBalance();
		System.out.println("===================================");
		
	}
	public void checkOpeningBalance() {
		if(openingBalance<=0)
			System.out.println("Opening balance should be greater than zero");
		if (accountType.isAccountBalanceValid(openingBalance)) {
			totalBalance+=openingBalance;
			currentBalance+=openingBalance;} 
		else {
			System.out.println("Opening Balance is less than min Limit "+ accountType.minLimit);
	}
		}
	
	public void displayAccountDetails() {
		System.out.println("Account ID: "+accountId);
		System.out.println("Account Holder Name: "+accountHolderName);
		System.out.println("Opening Balance: Rs " + openingBalance);
		System.out.println("Available Balance: Rs "+currentBalance);
		System.out.println("Account Type: "+ accountType);
	}
	
	public void depositAmount(double amount) {
		currentBalance+=amount;
		totalBalance+=amount;
		System.out.println("Rs "+amount+" deposited to account "+accountId);
		System.out.println("Available Balance: Rs "+getCurrentBalance());
		displayTotalBalance();
	}
	
	
	public void withdrawAmount(double amount) {
		if(!accountType.isAccountBalanceValid(currentBalance-amount)) {
			System.out.println("Insufficient Balance");
			System.out.println("Current Balance "+currentBalance+" only");
		}
		else {
			currentBalance-=amount;
			totalBalance-=amount;
			System.out.println("Rs "+amount+" debited from account "+accountId);
			System.out.println("Available Balance: Rs "+getCurrentBalance());
			displayTotalBalance();
		}
	}
	public double getCurrentBalance() {
		return currentBalance;
	}
	public void displayTotalBalance() {
		System.out.println("Total cash available at the bank: RS "+totalBalance);
	}

}
