package ar.com.codoAcodo.exception;

import ar.com.codoAcodo.herencia.Articulo;
import ar.com.codoAcodo.herencia.clase6.Libro;

public class MainException {

	public static void main(String[] args) {

		// En tiempo de compilacion no hay errores

		int valor = 10;

		int divisor = 1;

		// int divisor = 0; arithmeticException RuntimeException(tiempo de ejecución)
		// --> NullPointerException--> un objeto aun no ha nacido o es null, así que no
		// se pueden ejecutar sus métodos, ni acceder a sus atributos
		// ArrayIndexOutOfBoundsException -->cuando quiero acceder por fuera de la
		// longitud de un vector, indice que no existe
		// Unchecked exception- no las controla el developer

		// checked exception (debe controlarlas)

		int c = valor / divisor;

		System.out.println(c);

		Articulo articulo = new Libro("", "", "", 1);
		Libro l = (Libro) articulo;
		System.out.println(l.getIsbn());

		/*
		 * Musica musica = (Musica)articulo; System.out.println(musica.getAutor());
		 * ClassCastException-->no puede ser casteado a una clase de tipo música, está
		 * mal la herencia. articulo nace como libro y no de música, no heredan entre
		 * hermanos
		 */

	}

}
