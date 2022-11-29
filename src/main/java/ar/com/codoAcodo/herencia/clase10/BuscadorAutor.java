package ar.com.codoAcodo.herencia.clase10;

public class BuscadorAutor implements IBuscador<String> {

	@Override
	public String buscar() {
		System.out.println("Buscando un Autor");
		return "Autor";
	}

}
