package lti.bank;
import lti.bank.Account;

public class Current extends Account {

	public Current() {
	}

	public Current(String holder) {
		super(holder, INIT_CUR_BAL);
		this.od = OVERDRAFT_AMT;
	}

	@Override
	public void withdraw(double amount) {
		//ctxns[idx++]=new CurrentTransaction("Debit",balance,balance,overDraft);
		if (amount <= balance) {
			balance -= amount;
			System.out.println("Balance" + balance);
		} else if (amount <= od) {
			od -= (amount - balance);
			balance = 0;
			System.out.println("Bal:" + balance + "OD:" + od);
		} else
			System.out.println("insufficient funds");

	}

	@Override
	public void deposit(double amount) {
		//ctxns[idx++]=new CurrentTransaction("Credit",amount,balance,);
		if (od < OVERDRAFT_AMT) {
			od = od + amount;
			if (od > OVERDRAFT_AMT) {
				balance = balance + (od - OVERDRAFT_AMT);
				od = od - (od - OVERDRAFT_AMT);
			} else
				balance += amount;
			System.out.println("od after deposit " + od + " bal after deposit " + balance);
		}
	}
}