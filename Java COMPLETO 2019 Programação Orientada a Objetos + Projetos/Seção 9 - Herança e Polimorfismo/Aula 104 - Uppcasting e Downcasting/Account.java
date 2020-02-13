package entities;

public class Account {
	protected Double balance;
	private String holder;		//titular
	private Integer number;
	
	public Account() {
		
	}
	
	public Account(Integer number, String holder, Double balance) {
		this.balance = balance;
		this.holder = holder;
		this.number = number;
	}
	
	public Double getBalance() {
		return balance;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}
	
	public void withdraw(Double amount) {
		balance -= amount;
	}
	
	public void deposit(Double amount) {
		balance += amount;
	}

}
