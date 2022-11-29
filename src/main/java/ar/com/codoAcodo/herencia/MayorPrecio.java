package ar.com.codoAcodo.herencia;

import java.util.Arrays;

public class MayorPrecio extends FiltroBase implements IFiltro {

	public MayorPrecio() {
		super("Mayor Precio", new Articulo[] {});
	}

	public MayorPrecio(Articulo[] lista) {
		super("Mayor Precio", lista);
	}

	@Override
	public void ordenar() {

		System.out.println("Ordenando por: " + getNombre());
		// a - b = 0 => son iguales
		// a - b > 0 => a es mayor que b
		// a -b es < 0 => b es mayor que a

		Arrays.sort(lista, (a, b) -> Float.compare(b.getPrecio(), a.getPrecio()));

	}

}
