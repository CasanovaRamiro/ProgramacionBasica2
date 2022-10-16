package empresa;

public abstract class Empleados {
	private Boolean isMarried;
	private Integer children;
	private Integer hoursOfWork;
	private Double valuePerHour;
	final private Integer extraForBeengMarried= 100;
	final private Integer extraForEachKid = 200;

	public Empleados (Integer children,Integer hoursOfWork,Boolean isMarried) {
		this.isMarried=isMarried;
		this.children=children;
		this.hoursOfWork=hoursOfWork;
	}
	public abstract  Double calcularSueldo();
	public Integer getSalarioFamiliar() {
		Integer salarioFamiliar= 0;
		if(isMarried) {
			salarioFamiliar += extraForBeengMarried ;
		}
		return salarioFamiliar + children * extraForEachKid;
	}
	public Integer getHoursOfWork() {
		return hoursOfWork;
	}
}