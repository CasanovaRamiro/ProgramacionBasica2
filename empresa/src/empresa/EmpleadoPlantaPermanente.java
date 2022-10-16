package empresa;

public class EmpleadoPlantaPermanente extends Empleados {
	final Integer valuePerHour = 300;
	private Integer seniority;
	final private Integer valuePerYearWorked = 100;

	public EmpleadoPlantaPermanente(Integer children, Integer hoursOfWork, Boolean IsMarried, Integer seniority) {
		super(children, hoursOfWork, IsMarried);
		this.seniority = seniority;
		// TODO Auto-generated constructor stub
	}

	public int getSeniority() {
		return seniority;
		
	}
	@Override
	public Double calcularSueldo() {
		// TODO Auto-generated method stub
Double sueldo = (double) (valuePerHour * super.getHoursOfWork()) ;
			return sueldo + super.getSalarioFamiliar() + seniority * valuePerYearWorked;
	}
	

}
