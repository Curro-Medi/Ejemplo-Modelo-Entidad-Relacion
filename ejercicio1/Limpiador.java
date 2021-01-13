package practica7;

public class Limpiador extends Empleado{

	
	private int horas;
	
	
	public int calcularextra() {
		
		return horas;
		
	}


	public Limpiador(int dni, String nombre, String direccion, int horas) {
		super(dni, nombre, direccion);
		this.horas = horas;
	}


	
	
	
	
	
	public int getHoras() {
		return horas;
	}


	public void setHoras(int horas) {
		this.horas = horas;
	}
	
	
	
	
	
	
	
	
	
}
