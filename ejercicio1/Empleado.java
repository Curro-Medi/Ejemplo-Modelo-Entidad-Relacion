package practica7;

public class Empleado {

	
	private int dni;
	private String nombre;
	private String direccion;
	
	public int calculasueldo () {
		
		return dni;
		
	}
	
	
	public void newOperation () {
		
	}


	public Empleado(int dni, String nombre, String direccion) {
		
		this.dni = dni;
		this.nombre = nombre;
		this.direccion = direccion;
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public int getDni() {
		return dni;
	}


	public void setDni(int dni) {
		this.dni = dni;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	
	
	
	
	
}
