package ar.com.codoAcodo.herencia.clase6;

import ar.com.codoAcodo.herencia.Articulo;
import ar.com.codoAcodo.herencia.Buscador;

public class MainBuscador6 {

	public static void main(String[] args) {

		String clave = "harry potter";

		Buscador buscador = new Buscador(clave);

		buscador.buscar();

		Articulo[] resultados = buscador.getResultados();

		// simulo la pantalla de resultados
		for (Articulo unResultado : resultados) {
			// System.out.println(unResultado.toString());

			// propio del Articulo
			unResultado.getAutor();
			unResultado.getImg();
			unResultado.getPrecio();
			unResultado.getTitulo();

			if (unResultado instanceof Libro) {
				Libro l = (Libro) unResultado;
				l.getIsbn();
				l.getNroPaginas();
			}
			if (unResultado instanceof Musica) {
				Musica m = (Musica) unResultado;
				m.getSello();
				m.getTemas();
			}
			if (unResultado instanceof Pelicula) {
				Pelicula p = (Pelicula) unResultado;
				p.getProductora();
				p.getFormato();
			}

			System.out.println(unResultado);
		}

	}

}
