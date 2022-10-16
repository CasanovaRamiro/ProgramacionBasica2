package empresa;

public class EmpleadoPlantaTemporaria extends Empleados {
	
	final Integer valuePerHour = 200;
	
	public EmpleadoPlantaTemporaria(Integer children, Integer hoursOfWork, Boolean isMarried) {
		super(children, hoursOfWork, isMarried);
		// TODO Auto-generated constructor stub
	}
	@Override
	public Double calcularSueldo() {
		// TODO Auto-generated method stub
		Double sueldo = (double) (valuePerHour * super.getHoursOfWork()) ;
		
		return sueldo + super.getSalarioFamiliar();
	}
}
