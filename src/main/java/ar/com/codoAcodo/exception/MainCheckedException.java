package ar.com.codoAcodo.exception;

public class MainCheckedException {

	public static void main(String[] args) {

		// bloque de control de error : Exception
		try {

			Calculadora.dividir(10, 0);
			System.out.println("todo bien");

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Termina el programa con errores");
		}

	}

}
