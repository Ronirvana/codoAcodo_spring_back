package ar.com.codoAcodo.herencia.clase10;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MainMap {

	public static void main(String[] args) {

		// cargar los dias como string y numero
		Map<Integer, String> mapDias = new HashMap<>();

		// Key es el Integer y el Value es el String
		mapDias.put(1, "Lunes");
		mapDias.put(2, "Martes");
		mapDias.put(3, "Miercoles");
		mapDias.put(4, "Jueves");
		mapDias.put(5, "Viernes");
		mapDias.put(6, "Sabado");
		mapDias.put(7, "Domingo");

		// Obtengo un valor dada su clave(Key)
		String diaEnString = mapDias.get(4);
		System.out.println(diaEnString);

		// vacio?
		boolean mapaVacio = mapDias.isEmpty();
		System.out.println(mapaVacio);

		// todas las claves tienen un mapa
		Set<Integer> mapKeys = mapDias.keySet();
		System.out.println(mapKeys);

		// todos los valores de un mapa
		Collection<String> mapValues = mapDias.values();
		System.out.println(mapValues);

		// obtener key-value
		Set<Entry<Integer, String>> mapaEntry = mapDias.entrySet();
		System.out.println(mapaEntry);

		// recorrer un entry
		for (Entry<Integer, String> unEntry : mapaEntry) {
			Integer key = unEntry.getKey();
			String value = unEntry.getValue();
			System.out.println(key + "-" + value);
		}

	}

}
