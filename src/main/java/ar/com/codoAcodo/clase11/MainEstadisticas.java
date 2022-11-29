package ar.com.codoAcodo.clase11;

import java.util.Collection;
import java.util.List;

public class MainEstadisticas {

	public static void main(String[] args) {

		// interface = new clase
		SearchService search = new EstadisticaSearchServiceImpl();

		Collection<Turno> turnos = search.search();

		EstadisticaBuilder estadisticaBuilder = new EstadisticaBuilder(turnos);
		List<Estadistica> estadisticas = estadisticaBuilder.generar();

		for (Estadistica estadistica : estadisticas) {
			System.out.println(estadistica);
		}

	}

}
