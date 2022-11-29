package ar.com.codoAcodo.herencia;

public class CreadorDeFiltros {

	// método estático, no le pertenece a una instancia sino a la clase
	public static IFiltro crearFiltro(String clave) {

		IFiltro filtro;

		// interface i = new ClaseQueImplementa();

		switch (clave) {
		case "MASVENDIDOS":
			filtro = new MasVendidos();
			break;
		case "MAYORPRECIO":
			filtro = new MayorPrecio();
			break;
		case "MENORPRECIO":
			filtro = new MenorPrecio();
			break;
		default:
			filtro = new MasVendidos();
			break;
		}
		return filtro;

	}

	public static IFiltro crearFiltroDefault() {
		return crearFiltro("MAYORPRECIO");
	}
}
