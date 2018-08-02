import lti.bank.AccountFactory;
import lti.bank.Bank;
public class TestAccount {

	public static void main(String[] args) {
		// Account ac=new Account("Polo",5000);
		// ac.summary();
		//
		// ac.deposit(3000);
		// System.out.println(ac.getBalance());
		//
		// ac.withdraw(4000);
		// System.out.println(ac.getBalance());
		//
		// ac.withdraw(7000);
		// Savings sa = new Savings("polo", 3000);
		// sa.withdraw(3000);
		// sa.deposit(3000);
		// Current c = new Current("lili");
		// c.withdraw(7000);
		// c.deposit(7000);
		Bank sav = AccountFactory.openAccount("Savings","Polo");
		sav.summary();
		sav.deposit(2000);
		sav.deposit(4000);
		sav.withdraw(3000);
		sav.withdraw(7000);
		sav.statement();
	}

}
