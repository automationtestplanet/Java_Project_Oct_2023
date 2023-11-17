package exceptions;

public class BankTransactionException extends Exception {
	
	public BankTransactionException(String errorMessgae) {
		System.out.println(errorMessgae);
	}
	
	public String getMessage() {
		return "BankTransactionException error";
	}
	
	public void printStackTrace() {
		new BankTransactionException("BankTransactionException");
	}

}
