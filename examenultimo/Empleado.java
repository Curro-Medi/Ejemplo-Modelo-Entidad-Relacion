package proyectoEntorno;

import java.util.*;
public class Empleado {
	private String nombre;
	private String apellidos;
	private int salarioBruto;
	private int[][] tramos = {{10000,10},{20000,20},{30000,30},{40000,40},{50001,50}};
	
	public Empleado () {
		super();
	}
	public Empleado(String nombre, String apellidos, int salarioBruto) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.salarioBruto = salarioBruto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(int salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public int[][] getTramos() {
		return tramos;
	}

	public void setTramos(int[][] tramos) {
		this.tramos = tramos;
	}

	public double calculaSalarioNeto() throws Exception{
		  if(salarioBruto < 0) {
		    throw new Exception("El salario bruto debe ser positivo");
		  }
		  if(salarioBruto > 50000) {
			    throw new Exception("El salario bruto debe ser inferior 50k");
			  }
		  double porcentaje =getRetencion(this.tramos);
		  porcentaje=porcentaje/100;          
		  return salarioBruto * (1 - porcentaje); 
		
		}
		
		private int getRetencion(int[][] lista) {		
			int i=0;
			while (lista[i][0]<this.salarioBruto)i++;
			return lista[i][1];
		}	
		
}
