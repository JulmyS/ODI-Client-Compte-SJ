package ch.hearc.ig.odi.customeraccount.business;
public class Account {

	private Customer customer;
	private String number;
	private String name;
	private double balance = 0;
	private double rate = 0.001;

	/**
	 * 
	 * @param number
	 * @param name
	 * @param rate
	 * @param customer
	 */
	public Account(String number, String name, double rate, Customer customer) {
		// TODO - implement Account.Account
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param amount
	 */
	public void credit(double amount) {
		// TODO - implement Account.credit
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param amount
	 */
	public void debit(double amount) {
		// TODO - implement Account.debit
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param amount
	 * @param source
	 * @param target
	 */
	public static void transfert(double amount, Account source, Account target) {
		// TODO - implement Account.transfert
		throw new UnsupportedOperationException();
	}

}