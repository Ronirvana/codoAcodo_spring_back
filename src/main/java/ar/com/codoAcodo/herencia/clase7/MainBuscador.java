package ar.com.codoAcodo.herencia.clase7;

import ar.com.codoAcodo.herencia.Buscador;

public class MainBuscador {

	public static void main(String[] args) {

		String clave = "harry potter";
		String claveOrdenamiento = "MAYORPRECIO";

		Buscador buscador = new Buscador(clave);

		buscador.buscar();

	}

}
