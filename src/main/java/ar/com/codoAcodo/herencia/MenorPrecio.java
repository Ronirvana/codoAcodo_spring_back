package ar.com.codoAcodo.herencia;

import java.util.Arrays;

public class MenorPrecio extends FiltroBase implements IFiltro {

	public MenorPrecio() {
		super("Menor Precio", new Articulo[] {});
	}

	public MenorPrecio(Articulo[] lista) {
		super("Menor Precio", lista);
	}

	@Override
	public void ordenar() {
		System.out.println("Ordenando por: " + getNombre());

		Arrays.sort(lista, (a, b) -> Float.compare(a.getPrecio(), b.getPrecio()));
	}

}
