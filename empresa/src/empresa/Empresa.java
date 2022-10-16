package empresa;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	private Integer CUIT;
	private String razonSocial;
	private ArrayList<Empleados> listaDeEmpleados = new ArrayList<Empleados>();
	public Empresa(Integer CUIT, String razonSocial) {
		this.CUIT = CUIT;
		this.razonSocial = razonSocial;
	}
	public String getListaDeEmpleados() {
		return listaDeEmpleados.toString();
	}
	public void addEmpleados(Empleados currentEmployee) {
		listaDeEmpleados.add(currentEmployee) ;
	}
	
	public Double calcularTotalAPagarEnSueldos() {
		
		List <Double> sum = new ArrayList();
		listaDeEmpleados.forEach((e)->{  sum.add(e.calcularSueldo());});
		Double total = 0.0;
		for(Double d : sum)
		    total += d;
	
		return total;
	}
}