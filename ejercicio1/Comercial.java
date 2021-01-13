package practica7;

public class Comercial extends Empleado{

	
	private int contratosrealizados;
	private int nombrezona;
	
	
		public String calcularzonatrabajo() {
			
			return "ok";
			
		}
	
	
		public int calcularprima(String zona) {
			
			return contratosrealizados;
			
		}


		public Comercial(int dni, String nombre, String direccion, int contratosrealizados, int nombrezona) {
			super(dni, nombre, direccion);
			this.contratosrealizados = contratosrealizados;
			this.nombrezona = nombrezona;
		}


		
		
		
		
		
		
		
		
		
		
		public int getContratosrealizados() {
			return contratosrealizados;
		}


		public void setContratosrealizados(int contratosrealizados) {
			this.contratosrealizados = contratosrealizados;
		}


		public int getNombrezona() {
			return nombrezona;
		}


		public void setNombrezona(int nombrezona) {
			this.nombrezona = nombrezona;
		}
	
	
		
		
		
	
}
