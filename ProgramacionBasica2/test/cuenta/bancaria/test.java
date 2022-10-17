package cuenta.bancaria;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class test {

	@Test
	void CuentaDeSueldo() {
		CuentaDeSueldo cds = new CuentaDeSueldo();
		Double saldoInicial = cds.getSaldo();
		cds.depositar(800.00);
		Double saldoDespuesDeDepositar = cds.getSaldo();
		cds.extraer(400.00);
		Double saldoDespuesDeExtraerBien = cds.getSaldo();
		cds.extraer(1000.00);
		Double saldoDespuesDeExtraerMal = cds.getSaldo();
		
		assertEquals((Double)00.00,saldoInicial);
		assertEquals((Double)800.00, saldoDespuesDeDepositar);
		assertEquals((Double)400.00, saldoDespuesDeExtraerBien);
		assertEquals((Double)400.00, saldoDespuesDeExtraerMal);
		
	}
	
	@Test
	void CajaDeAhorros() {
		CajaDeAhorros cda = new CajaDeAhorros();
		Double saldoInicial = cda.getSaldo();
		cda.depositar(800.00);
		Double saldoDespuesDeDepositar = cda.getSaldo();
		cda.extraer(400.00);
		Double saldoDespuesDeExtraerBien = cda.getSaldo();
		cda.extraer(1000.00);
		Double saldoDespuesDeExtraerMal = cda.getSaldo();
		cda.extraer(10.00);
		cda.extraer(10.00);
		cda.extraer(10.00);
		cda.extraer(10.00);
		Double saldoDespuesDeExtraer5Veces = cda.getSaldo();
		cda.extraer(10.00);
		Double saldoDespuesDeExtraer6Veces = cda.getSaldo();
		cda.extraer(10.00);
		Double saldoDespuesDeExtraer7Veces = cda.getSaldo();

		
		
		assertEquals((Double)00.00,saldoInicial);
		assertEquals((Double)800.00, saldoDespuesDeDepositar);
		assertEquals((Double)400.00, saldoDespuesDeExtraerBien);
		assertEquals((Double)400.00, saldoDespuesDeExtraerMal);
		assertEquals((Double)360.00, saldoDespuesDeExtraer5Veces);
		assertEquals((Double)344.00, saldoDespuesDeExtraer6Veces);
		assertEquals((Double)328.00, saldoDespuesDeExtraer7Veces);
		
		
	}

	@Test
	void CuentaCorriente() {
		CuentaCorriente cc = new CuentaCorriente(150.00);
		Double saldoInicial = cc.getSaldo();
		cc.depositar(100.00);
		Double saldoDespuesDeDepositar = cc.getSaldo();
		cc.extraer(100.00);
		Double saldoDespuesDeExtraerBien = cc.getSaldo();
		cc.depositar(100.00);
		cc.extraer(1000.00);
		Double saldoDespuesDeExtraerMal = cc.getSaldo();
		cc.extraer(10.00);
		cc.extraer(10.00);
		cc.extraer(10.00);
		cc.extraer(10.00);
		Double saldoDespuesDeExtraer5Veces = cc.getSaldo();
		cc.extraer(10.00);
		Double saldoDespuesDeExtraer6Veces = cc.getSaldo();
		cc.extraer(10.00);
		Double saldoDespuesDeExtraer7Veces = cc.getSaldo();
		cc.depositar(60.0);
		cc.extraer(200.00);
		Double saldoDespuesDeRetirarConCredito = cc.getSaldo();
		Double deudaDespuesDeRetirarConCredito = cc.getDeuda();
		Double creditoDespuesDeRetirarConCredito = cc.getCredito();
		cc.depositar(50.00);
		Double saldoDespuesDeDepositarMenosQueDeuda = cc.getSaldo();
		Double deudaDespuesDeDepositarMenosQueDeuda = cc.getDeuda();
		cc.depositar(155.00);
		Double deudaDespuesDeDepositar2 = cc.getDeuda();
		Double saldoDespuesDeDepositar2 = cc.getSaldo();


		
		
		assertEquals((Double)00.00,saldoInicial);
		assertEquals((Double)100.00, saldoDespuesDeDepositar);
		assertEquals((Double)0.00, saldoDespuesDeExtraerBien);
		assertEquals((Double)100.00, saldoDespuesDeExtraerMal);
		assertEquals((Double)60.00, saldoDespuesDeExtraer5Veces);
		assertEquals((Double)50.00, saldoDespuesDeExtraer6Veces);
		assertEquals((Double)40.00, saldoDespuesDeExtraer7Veces);
		assertEquals((Double)00.00, saldoDespuesDeRetirarConCredito);
		assertEquals((Double)105.00, deudaDespuesDeRetirarConCredito);
		assertEquals((Double)50.00, creditoDespuesDeRetirarConCredito);
		assertEquals((Double)55.00, deudaDespuesDeDepositarMenosQueDeuda);
		assertEquals((Double)0.00, saldoDespuesDeDepositarMenosQueDeuda);
		assertEquals((Double)0.00, deudaDespuesDeDepositar2);
		assertEquals((Double)100.00, saldoDespuesDeDepositar2);

		
		
		
		
	}
}
