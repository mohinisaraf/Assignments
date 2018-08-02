package lti.bank;

public class CurrentTransaction extends Transaction {
	
	protected double overDraft;
	public CurrentTransaction() {
	}
	public CurrentTransaction(String type, double amount, double balance,double overDraft) {
		this.type = type;
		this.amount = amount;
		this.balance = balance;
		this.overDraft=overDraft;
	}
	@Override
	public String toString() {
		return type+"\t"+amount+ "\t" + balance+"\t"+overDraft;
	}
	
}
