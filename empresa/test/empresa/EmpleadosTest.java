package empresa;


import org.junit.Assert;
import org.junit.jupiter.api.Test;

class EmpleadosTest {


	//Un empleado de Planta Temporaria con 80 horas trabajadas,
		//con esposa y sin hijos.
	@Test
	void EmpleadoDePlantaTemporariaCon80HorasTrabajadasEsposaYSinHijos() {
		EmpleadoPlantaTemporaria empleado = new EmpleadoPlantaTemporaria(0,80,true);
		Double salario = empleado.calcularSueldo();
		Assert.assertEquals((Double) 16100.00,salario);
	}
	
	@Test
	void EmpleadoDePlantaPermanenteCon80HorasTrabajadasEsposaY2Hijos() {
		EmpleadoPlantaPermanente empleado = new EmpleadoPlantaPermanente(2,80,true,6);
		Double salario = empleado.calcularSueldo();
		Assert.assertEquals((Double) 25100.00,salario);
	}
	
	@Test
	void EmpleadoDePlantaPermanenteCon160HorasTrabajadasSinEsposaYSinHijos() {
		EmpleadoPlantaPermanente empleado = new EmpleadoPlantaPermanente(0,160,false,4);
		Double salario = empleado.calcularSueldo();
		Assert.assertEquals((Double) 48400.00,salario);
	}
	
	@Test
	void GerenteCon160HorasTrabajadasConEsposaY1Hijos() {
		Gerente empleado = new Gerente(1,160,true,10);
		Double salario = empleado.calcularSueldo();
		Assert.assertEquals((Double) 65800.00,salario);
	}
	
	@Test
	void EmpresaCon4Empleados() {
		Empresa empresa = new Empresa(135123, "Razon Social");
		Gerente gerente = new Gerente(1,160,true,10);
		EmpleadoPlantaTemporaria empleadoPT = new EmpleadoPlantaTemporaria(0,80,true);
		EmpleadoPlantaPermanente empleadoPP = new EmpleadoPlantaPermanente(0,160,false,4);
		EmpleadoPlantaPermanente empleadoPP2 = new EmpleadoPlantaPermanente(2,80,true,6);
		
		
		
		empresa.addEmpleados(gerente);
		empresa.addEmpleados(empleadoPT);
		empresa.addEmpleados(empleadoPP);
		empresa.addEmpleados(empleadoPP2);
		
		Double totalSueldos = empresa.calcularTotalAPagarEnSueldos();
		Assert.assertEquals((Double) 155400.00,totalSueldos);
	}
}
