package ar.com.codoAcodo.herencia;

import ar.com.codoAcodo.herencia.clase6.Libro;
import ar.com.codoAcodo.herencia.clase6.Musica;
import ar.com.codoAcodo.herencia.clase6.Pelicula;

public class DBUtil {

	Articulo[] obtenerResultado(String claveBusqueda) {

		Libro primero = new Libro("http://sitio.com.ar/img/img1.jpg", "titulo" + claveBusqueda, "Autor1", 4390);
		primero.setIsbn("97979797");
		primero.setNroPaginas(72);

		Libro libro2 = new Libro("http://sitio.com.ar/img/img4.jpg", "titulo" + claveBusqueda, "Autor4", 4350, 100,
				"565656");

		Musica musica1 = new Musica("http://sitio.com.ar/img/img2.jpg", "titulo" + claveBusqueda, "Autor2", 40500,
				"Sony Music", new String[] {});
		Musica musica2 = new Musica("http://sitio.com.ar/img/img6.jpg", "titulo" + claveBusqueda, "Autor6", 4059);
		musica2.setSello("Warner");

		Pelicula pelicula1 = new Pelicula("http://sitio.com.ar/img/img3.jpg", "titulo" + claveBusqueda, "Autor3", 2040,
				"20TH CENTURY FOX", "BLU-RAY");
		Pelicula pelicula2 = new Pelicula("http://sitio.com.ar/img/img5.jpg", "titulo" + claveBusqueda, "Autor5", 8000);
		pelicula2.setFormato("BLU-RAY 3D");
		pelicula2.setProductora("Netflix");
		
		Articulo a = new Articulo("http://sitio.com.ar/img/img7.jpg", "titulo" + claveBusqueda, "Autor7", 8800);

		// crear un vector/array/arreglo
		// inicia en la posicion 0
		/*
		 * Articulo[] resultados = new Articulo[3];//vector vacio resultados[0] =
		 * primero; resultados[1] = segundo; resultados[2] = tercero;
		 */

		// Articulo[] res = new Articulo[] {primero,segundo,tercero};//vector con datos
		// cargados

		// return res;

		return new Articulo[] {primero, libro2, musica1, musica2, pelicula1, pelicula2,a};
	}

}
