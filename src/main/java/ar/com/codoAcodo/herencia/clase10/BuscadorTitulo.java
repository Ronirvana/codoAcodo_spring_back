package ar.com.codoAcodo.herencia.clase10;

public class BuscadorTitulo implements IBuscador<String> {

	@Override
	public String buscar() {
		System.out.println("Buscando titulo...");
		return "Titulo";
	}

}
