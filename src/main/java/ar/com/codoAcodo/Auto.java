package ar.com.codoAcodo;

public class Auto {

	/*
	 * atributos
	 */
	boolean encendido;
	float velocidad;
	String marca;
	String modelo;
	int anio;
	// constructor por defecto

	Auto() {
		// acá va el código cuando nace el auto
		encendido = false;
	}

	// métodos

	void encender() {

		encendido = true;

	}

	void apagar() {

	}

	void acelerar() {

	}

	void frenar() {

	}

	void mostrarInfo() {

		System.out.println("encendido: " + encendido);
	}

}
