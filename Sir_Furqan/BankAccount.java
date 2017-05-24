package Sir_Furqan;


public class BankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	    private String AccountTitle;
	    private String AccountType;
	    private double AccountBalance;
	    
	    public BankAccount(String title, String type, double balance) {
	        this.AccountTitle = title;
	        this.AccountType = type;
	        this.AccountBalance = balance;
	    }
	    
	    public String getAccountTitle() {
	        return this.AccountTitle;
	    }
	    
	    public String getAccountType() {
	        return this.AccountType;
	    }
	    
	    public double getAccountBalance() {
	        return this.AccountBalance;
	    }
	    
	    public void depositAmount(double x) {
	        this.AccountBalance += x;
	    }
	    
	    public void withdrawAmount (double x) {
	    	if ( x > this.AccountBalance) {
	            System.out.println("Insufficient funds!");
	            return;
	            }
	        this.AccountBalance -= x;
	    }
	    
	}




