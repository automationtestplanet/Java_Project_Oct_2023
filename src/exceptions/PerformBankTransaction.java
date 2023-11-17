package exceptions;

public class PerformBankTransaction {

	public static void main(String[] args) throws BankTransactionException {

		BankTransactions ameerpetBranch = new BankTransactions();
		ameerpetBranch.deposit(5000);
//		try {
//			ameerpetBranch.withdrawl(1234, "SAVINGS_ACCOUNT", 30000000);
//		}catch(BankTransactionException bk) {
//			System.out.println(bk.getMessage());
//		}
		
		try {
			ameerpetBranch.withdrawl(1234, "SAVINGS_ACCOUNT", 30000000);
		}catch(Exception bk) {
			System.out.println(bk.getMessage());
		}
		
		ameerpetBranch.displayBalance();
		
	}

}
