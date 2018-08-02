package lti.bank;

public abstract class Account implements Bank  {
	private int acntNo;
	private String holder;
	protected double balance;
	protected double od;
	private static int autogen = INIT_ACNT_NO;
	
	protected Transaction[]  txns;
	protected CurrentTransaction[] ctxns;
	protected int idx,cidx;

	public Account() {
	}

	public Account(String holder, double balance) {
		this.acntNo = autogen++;
		this.holder = holder;
		this.balance = balance;
		//instantiating Transaction array for the account
		txns=new Transaction[10];
		ctxns=new CurrentTransaction[10];
		//adding opening account transaction
		txns[idx++]=new Transaction("OB",balance,balance);
		//ctxns[cidx++]=new CurrentTransaction("OB",balance,balance,overDraft);
	}

	public void summary() {
		System.out.println("A/C no:" + acntNo);
		System.out.println("Holder:" + holder);
		System.out.println("Balance:" + balance);
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
		txns[idx++]=new Transaction("Credit",amount,balance);
		//ctxns[idx++]=new CurrentTransaction("Credit",amount,balance,);
	}

	//public abstract void withdraw(double amount);
	// {
	// if(amount<=balance)
	// balance-=amount;
	// else
	// System.out.println("insufficient funds");
	// }
	public void statement() {
		System.out.println("Statement of account of:"+acntNo);
		for(int i=0;i<idx;i++)
		{
			System.out.println(txns[i]);
		}
		
	}

}