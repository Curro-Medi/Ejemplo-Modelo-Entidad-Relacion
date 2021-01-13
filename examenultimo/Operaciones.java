public class Operaciones {

	double resultado;

	double getResultado() {
		return resultado;
	}

	void suma(double n1, double n2) {
		resultado = n1 + n2;
	}

	void resta(double n1, double n2) {
		resultado = n1 - n2;
	}

	void multiplica(double n1, double n2) {
		resultado = n1 * n2;
	}

	void divide(double n1, double n2) throws Exception {
		if (n2 == 0)
			throw new Exception("El divisor no puede ser 0");
		resultado = n1 / n2;
	}

	double mayor(double n1, double n2) {
		double n;
		if (n1 >= n2)
			return n1;
		else
			return n2;
	}

	String pintaNumeros(double n1, double n2) {
		return "Los numeros son " + n1 + " " + n2;
	}
}