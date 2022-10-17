package cuenta.bancaria;

public abstract class CuentaDeBanco {
	private Double balance = 0.0;
	
	

	public Double getSaldo() {
		return getBalance();
		}
	
	public void depositar(Double monto) {
		setBalance(getBalance() + monto);
	}
	public abstract Double extraer (Double monto);

	protected Double getBalance() {
		return balance;
	}

	protected void setBalance(Double balance) {
		this.balance = balance;
	}
}
