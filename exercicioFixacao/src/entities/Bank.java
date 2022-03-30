package entities;

public class Bank {
	
	//atributos
	private int account;
	private String name;
	private double valueDeposit;
	
	public Bank() {
		
	}
	
	//obriga a ter todos os valores 
	public Bank(int account, String name, double valueDeposit) {
		this.account = account;
		this.name = name;
		deposit(valueDeposit);
	}
	//sobre carga para que nao seja necessario ter um deposito
	public Bank(int account, String name) {
		this.account = account;
		this.name = name;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getValueDeposit() {
		return valueDeposit;
	}
	public void setValueDeposit(double valueDeposit) {
		this.valueDeposit = valueDeposit;
	}
	public int getAccount() {
		return account;
	}
	public void deposit(double valueDeposit) {
		this.valueDeposit += valueDeposit;
	}
	
	public void withdrawDeposit(double valueDeposit) {
		this.valueDeposit -= valueDeposit + 5.00;
	}
	//necessario para a impressao do objeto
	public String toString() {
		return  "Account: " + account + ", Name: " + name.toUpperCase() + ", Balance: $ " + String.format("%.2f", valueDeposit);
	}

	
}
