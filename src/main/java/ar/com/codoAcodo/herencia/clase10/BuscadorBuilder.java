package ar.com.codoAcodo.herencia.clase10;

import java.util.HashMap;
import java.util.Map;

public class BuscadorBuilder {

	public static Map<TipoBuscadorEnum, IBuscador<String>> mapBuilder() {

		Map<TipoBuscadorEnum, IBuscador<String>> mapBuscador = new HashMap<>();

		mapBuscador.put(TipoBuscadorEnum.TITULO, new BuscadorTitulo());
		mapBuscador.put(TipoBuscadorEnum.ISBN, new BuscadorISBN());
		mapBuscador.put(TipoBuscadorEnum.AUTOR, new BuscadorAutor());

		return mapBuscador;

	}

}
