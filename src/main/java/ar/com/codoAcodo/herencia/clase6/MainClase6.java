package ar.com.codoAcodo.herencia.clase6;

import ar.com.codoAcodo.herencia.Articulo;

public class MainClase6 {

	public static void main(String[] args) {

		Libro libro1 = new Libro("/libro1.jpg", "Iron Man", "Autor1", 4500);

		libro1.getAutor();

		System.out.println(libro1);// invoca el método toString

		Articulo articulo = new Articulo("/libro1.jpg", "Iron Man", "Autor1", 4500);

		// Padre p = new Hijo();
		Articulo a = new Libro("/libro2.jpg", "Iron Man 2", "Autor2", 3500);

		// casteo, accedo a los atributos de Libro dentro de Articulo(down Casting)
		Libro libroDentroDeA = (Libro) a;
		libroDentroDeA.setAutor("Mariana Enriquez");

		Articulo[] resultados = new Articulo[2];
		resultados[0] = libro1;
		resultados[1] = articulo;

	}

}
