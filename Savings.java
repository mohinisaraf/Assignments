package lti.bank;
import lti.bank.Account;

public class Savings extends Account {

	public Savings() {
	}

	public Savings(String holder) {
		super(holder, MIN_SAV_BAL);
	}

	@Override
	public void withdraw(double amount) {
		txns[idx++]=new Transaction("Debit",balance,balance);
		if (amount <= (balance - MIN_SAV_BAL)) {
			balance -= amount;
			System.out.println("Balance" + balance);
		} else
			System.out.println("insufficient funds");
	}

	@Override
	public void deposit(double amount) {
		super.deposit(amount);
		System.out.println("balance after deposit" + balance);
	}

}
