package ar.com.codoAcodo.clase13;

import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

import ar.com.codoAcodo.herencia.Articulo;
import ar.com.codoAcodo.herencia.DBUtil;

public class MainCollections {

	public static void main(String[] args) {

		// Collection/Set/List/Map

		// var permite hacer diferencia de tipo

		var col = new TreeSet<String>(); // Está implementado sobre un sistema de arbol(Nodo raiz(root), nodo izq(mas
											// chico)
											// nodo derecho mas grande

		col.add("H");
		col.add("A"); // ordena de forma natural los datos
		col.add("B");

		System.out.println(col);

		var col2 = new TreeSet<Integer>();

		col2.add(9);
		col2.add(5);
		col2.add(4);

		System.out.println(col2);

		// los wrapper (Integer/Long/ Double) tienen un orden natural de ordenamiento,
		// para lo demás hay que indicar cuál es el ordenamiento

		// si quiero cambiar el orden natural de mis clases
		Comparator<Articulo> cmpArtXTitulo = new Comparator<>() {

			@Override
			public int compare(Articulo o1, Articulo o2) {
				return o2.getTitulo().compareTo(o1.getTitulo());
			}
		};

		var articulos = new TreeSet<>(cmpArtXTitulo);
		DBUtil db = new DBUtil();
		articulos.addAll(List.of(db.obtenerResultado("clave"))); // ordena con el Comparable compareTo

		System.out.println(articulos);

		for (Articulo art : articulos) {
			System.out.println(art.getTitulo() + ": " + art.getPrecio() + "- " + art.getCantidadVendido());
		}

	}

}
