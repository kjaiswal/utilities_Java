
public class Account {

	private double balance;
	
	public Account (double initialAmount){
		if (initialAmount >= 0) 
		balance = initialAmount;
	}
	
	public void credit(double amount){
		balance += amount;
	}
	
	public double getBalance(){
		return balance;
	}
}
