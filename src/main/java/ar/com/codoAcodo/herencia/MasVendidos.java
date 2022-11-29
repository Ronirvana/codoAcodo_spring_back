package ar.com.codoAcodo.herencia;

import java.util.Arrays;

public class MasVendidos extends FiltroBase implements IFiltro {

	public MasVendidos() {
		super("Mas Vendido", new Articulo[] {});
	}

	public MasVendidos(Articulo[] lista) {
		super("Mas Vendido", lista);
	}

	@Override
	public void ordenar() {

		System.out.println("Ordenando por: " + getNombre());
		Arrays.sort(lista, (a, b) -> Integer.compare(b.getCantidadVendido(), a.getCantidadVendido()));

	}

}
