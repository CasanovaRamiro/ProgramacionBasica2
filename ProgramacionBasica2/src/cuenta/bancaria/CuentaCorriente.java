package cuenta.bancaria;

public class CuentaCorriente extends CuentaDeBanco{
	private Double credito;
	private Double deuda=0.0;
	public CuentaCorriente (Double credito) {
		this.credito =credito;
	}
	
	public void depositar(Double monto) {
		if(deuda>=monto) {
			deuda=deuda-monto;
			return;
		}
		
			setBalance(super.getBalance() + (monto-deuda));
			deuda = 0.0;		
	}
	
	public Double extraer(Double monto) {		
		if(monto <= super.getBalance()) {
			super.setBalance(super.getBalance()-monto);
			return monto;
		}
		if(monto <= (super.getBalance()+credito)) {
			deuda = (monto - super.getBalance())*1.05;
			credito = credito - (monto-super.getBalance());
			super.setBalance(0.0);
			return monto;
		}
		return 0.0;
	}

	public Double getDeuda() {
		return deuda;
	}
	public Double getCredito() {
		return credito;
	}

}
