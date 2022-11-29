package ar.com.codoAcodo.herencia.clase10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionMain {

	public static void main(String[] args) {

		// interface i = nuevaclasequeimplementainterface

		// crea una Collection- ArrayList admite duplicados
		Collection<String> nombres = new ArrayList<>();

		// agregar elementos
		// permite crecer de manera dinamica, no necesita parametrizarse como los
		// vectores
		nombres.add("Camila");
		nombres.add("Zyrano");
		nombres.add("Rocio");
		nombres.add("Mariana");
		nombres.add("Oscar");
		nombres.add("Rocio");

		// tamaño de la Collection
		int n = nombres.size();
		System.out.println(n);

		// Como saber si el array está vacío??
		boolean isEmpty = nombres.isEmpty();
		System.out.println(isEmpty);

		/*
		 * Filtrar antes de recorrer- instanciando una nueva Collection Collection
		 * <String> i = new HashSet<>(); i.addAll(nombres);
		 */
		// haciendo un casting de la collection porque list y set heredan de collection
		nombres = new HashSet<>(nombres);

		// recorrer la Collection- ForEach tipo de dato y el nombre de la collection
		for (String aux : nombres) {
			System.out.println(aux);

		}

		System.out.println("-------------------------------");

		// HashSet no admite duplicados- Filtra los resultados duplicados
		Collection<String> nombres2 = new HashSet<>();
		nombres2.add("Camila");
		nombres2.add("Zyrano");
		nombres2.add("Rocio");
		nombres2.add("Mariana");
		nombres2.add("Oscar");
		nombres2.add("Rocio");

		// tamaño de la Collection
		int x = nombres.size();
		System.out.println(x);

		// recorrer la Collection- ForEach tipo de dato y el nombre de la collection
		for (String aux : nombres2) {
			System.out.println(aux);

		}
		System.out.println("-----------");

		/*
		 * Para borrar los datos de una Collection nombres.clear();
		 * System.out.println(nombres); boolean y = nombres.isEmpty();
		 * System.out.println(y);
		 */

		// Recorrer una Collection usando un Iterator
		Iterator<String> itNombres = nombres.iterator();
		while (itNombres.hasNext()) { // hasNext evalua si hay elementos en la Collection
			String nombre = itNombres.next(); // next devuelve los elementos
			System.out.println(nombre);
			if ("Rocio".equals(nombre)) {
				itNombres.remove(); // remueve los elementos de la Collection de manera segura
			}

		}
		// verifica si está vacía la collection
		System.out.println(nombres.isEmpty());
		System.out.println(nombres);

	}

}
