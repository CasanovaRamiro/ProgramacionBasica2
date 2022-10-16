package empresa;

public class Gerente extends EmpleadoPlantaPermanente {
	final Integer valuePerHour = 400;
	final private Integer valuePerYearWorked = 150;
	public Gerente(Integer children, Integer hoursOfWork, Boolean IsMarried, Integer seniority) {
		super(children, hoursOfWork, IsMarried, seniority);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public Double calcularSueldo() {
		// TODO Auto-generated method stub
		Double sueldo = (double) (valuePerHour * super.getHoursOfWork()) ;
			return sueldo + super.getSalarioFamiliar() + super.getSeniority() * valuePerYearWorked;
	}

}
