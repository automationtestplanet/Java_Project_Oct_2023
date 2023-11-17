package exceptions;

public class BankTransactions {

	static int balance = 100000;
	static final int PIN= 1234;

	void deposit(int depositAmount) {
		balance += depositAmount;
		System.out.println("Balance Amount: " + BankTransactions.balance);
	}

	void withdrawl(int pin, String typeOfAccount, int withdrawlAmount) throws BankTransactionException {
		switch (typeOfAccount) {
		case "SAVINGS_ACCOUNT":
			if (pin == BankTransactions.PIN) {
				if (withdrawlAmount < balance) {
					if (withdrawlAmount <= 50000) {
						balance -= withdrawlAmount;
						System.out.println("Balance Amount: " + BankTransactions.balance);
					} else {
						throw new BankTransactionException("Withdrawl Amount exceded, Limt for SAVINGS_ACCOUNT is 50000");
					}
				} else {
					throw new BankTransactionException("Insufficient Balance");
				}
			} else {				
				throw new BankTransactionException("Incorrect PIN");
			}
			break;
		case "CURRENT_ACCOUNT":
			if (pin == BankTransactions.PIN) {
				if (withdrawlAmount < balance) {
					if (withdrawlAmount <= 200000) {
						balance -= withdrawlAmount;
						System.out.println("Balance Amount: " + BankTransactions.balance);
					} else {
						System.out.println("Withdrawl Amount exceded, Limt for CURRENT_ACCOUNT is 200000");
					}
				} else {
					System.out.println("Insufficient Balance");
				}
			} else {
				System.out.println("Incorrect PIN");
			}
			break;
		case "RETAIL_ACCOUNT":
			if (pin == BankTransactions.PIN) {
				if (withdrawlAmount < balance) {
					if (withdrawlAmount <= 500000) {
						balance -= withdrawlAmount;
						System.out.println("Balance Amount: " + BankTransactions.balance);
					} else {
						System.out.println("Withdrawl Amount exceded, Limt for RETAIL_ACCOUNT is 500000");
					}
				} else {
					System.out.println("Insufficient Balance");
				}
			} else {
				System.out.println("Incorrect PIN");
			}
			break;
		default:
			System.out.println("Please select correct account type");
		}
	}

	void displayBalance() {
		System.out.println("Total Balance: " + BankTransactions.balance);
	}

	

}
