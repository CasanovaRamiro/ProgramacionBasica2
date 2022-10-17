package cuenta.bancaria;

public class CajaDeAhorros extends CuentaDeBanco{
	private final Integer EXTRACCIONES_SIN_CARGO = 5;
	private final Integer EXTRA_POR_EXTRACCION = 6;
	
	private Integer cantidadDeExtracciones=0;
	
	@Override
	public Double extraer(Double monto) {
		// TODO Auto-generated method stub
		if(monto > super.getBalance() || monto <= 0) {
			return 0.0;
		}else {
			if(cantidadDeExtracciones < EXTRACCIONES_SIN_CARGO) {
				cantidadDeExtracciones ++;
				super.setBalance(super.getBalance()-monto);
				return monto;
			}else {
				if(monto+EXTRA_POR_EXTRACCION > super.getBalance()) {
				return 0.0;
				}else {
					cantidadDeExtracciones ++;
					super.setBalance(super.getBalance()-(monto+EXTRA_POR_EXTRACCION));
					return monto;
				}
				
				
			}
			
			
		}
	}

	

}
