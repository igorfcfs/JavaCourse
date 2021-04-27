package entities;

public final class SavingsAccount extends Account {

	private Double interestRate;
	
	public SavingsAccount() {
		super();
	}
	
	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}
	
	public Double getInterestRate() {
		return interestRate;
	}
	
	public void seetInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	@Override
	public final void withdraw(Double amount) {
		balance -= amount;
	}
	
}
