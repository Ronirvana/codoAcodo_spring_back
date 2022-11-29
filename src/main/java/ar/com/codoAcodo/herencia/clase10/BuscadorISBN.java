package ar.com.codoAcodo.herencia.clase10;

public class BuscadorISBN implements IBuscador<String> {

	@Override
	public String buscar() {
		System.out.println("Buscando isbn...");
		return "isbn";
	}

}
