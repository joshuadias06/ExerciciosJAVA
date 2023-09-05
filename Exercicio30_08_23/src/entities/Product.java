package entities;

public class Product {
	
	private int numAccount;
	private String name;
	private double deposit;

	public Product(int numAccount, String name, double deposit) {
		super();
		this.numAccount = numAccount;
		this.name = name;
		this.deposit = deposit;
	}
	public int getNumAccount() {
		return numAccount;
	}

	public void setNumAccount(int numAccount) {
		this.numAccount = numAccount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDeposit() {
		return deposit;
	}
	
}
