package practica7;

public class Encargado extends Empleado{

	
	
	private int empleadosacasucargo;
	private String oficinatrabajo;
	
	
	public int calcularsubida (int numemple) {
		
		return empleadosacasucargo;
		
	}


	
	public Encargado(int dni, String nombre, String direccion, int empleadosacasucargo, String oficinatrabajo) {
		super(dni, nombre, direccion);
		this.empleadosacasucargo = empleadosacasucargo;
		this.oficinatrabajo = oficinatrabajo;
	}






	public int getEmpleadosacasucargo() {
		return empleadosacasucargo;
	}


	public void setEmpleadosacasucargo(int empleadosacasucargo) {
		this.empleadosacasucargo = empleadosacasucargo;
	}


	public String getOficinatrabajo() {
		return oficinatrabajo;
	}


	public void setOficinatrabajo(String oficinatrabajo) {
		this.oficinatrabajo = oficinatrabajo;
	}
	
	
	
	
	
}
