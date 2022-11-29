package ar.com.codoAcodo.herencia.clase10;

import java.util.Map;

public class MainBuscadorGenerico {

	public static void main(String[] args) {

		String tipoDeBusqueda = "isbn";

		TipoBuscadorEnum opcion = TipoBuscadorEnum.valueOf(tipoDeBusqueda.toUpperCase()); // MAYUS

		Map<TipoBuscadorEnum, IBuscador<String>> mapBuscador = BuscadorBuilder.mapBuilder();

		boolean existe = mapBuscador.containsKey(opcion);
		System.out.println(existe);
		if (existe) {
			IBuscador<String> buscadorT = mapBuscador.get(opcion);
			String dato = buscadorT.buscar();
			System.out.println(dato);
		} else {
			throw new RuntimeException("NO EXISTE EL BUSCADOR " + opcion);
		}
	}

}
