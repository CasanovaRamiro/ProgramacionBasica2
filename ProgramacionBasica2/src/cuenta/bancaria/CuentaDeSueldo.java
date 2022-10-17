package cuenta.bancaria;

public class CuentaDeSueldo extends CuentaDeBanco {


	@Override
	public Double extraer(Double monto) {
		// TODO Auto-generated method stub
		if(monto > super.getBalance() || monto <= 0) {
			return 0.0;
		}else {
			super.setBalance(super.getBalance()-monto);
			return monto;
		}
	}

}
