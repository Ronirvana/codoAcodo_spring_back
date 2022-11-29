package ar.com.codoAcodo.exception;

public class Calculadora {

	public static float dividir(int a, int b) throws Exception {
		if (b == 0) {
			// voy a lanzar una Exception de tipo checked
			throw new Exception("No se puede dividir por 0");
		}

		return a / b;
	}

}
