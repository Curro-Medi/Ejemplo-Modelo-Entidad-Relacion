package practica7;

public class Administrativo extends Empleado{
	
	
	private String categoria;
	private int pulsaciones;
	
	
	public Administrativo(int dni, String nombre, String direccion, String categoria, int pulsaciones) {
		super(dni, nombre, direccion);
		this.categoria = categoria;
		this.pulsaciones = pulsaciones;
	}


	
	
	
	
	
	
	
	
	
	
	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	public int getPulsaciones() {
		return pulsaciones;
	}


	public void setPulsaciones(int pulsaciones) {
		this.pulsaciones = pulsaciones;
	}
	
	
	
	
	
	
	
	
	
	
	

}
