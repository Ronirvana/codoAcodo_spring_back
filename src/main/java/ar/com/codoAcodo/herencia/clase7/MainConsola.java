package ar.com.codoAcodo.herencia.clase7;

public class MainConsola {

	public static void main(String[] args) {

		// Ahora uso la clase que vende

		VendedorConsolas vc = new VendedorConsolas();
		IJugable algo = vc.vender();
		algo.jugar();

		IJugable[] jugables = vc.venderVarios();
		for (IJugable aux : jugables) {
			aux.jugar();
		}

	}

}
