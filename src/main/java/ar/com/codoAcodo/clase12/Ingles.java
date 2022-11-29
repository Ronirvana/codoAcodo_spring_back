package ar.com.codoAcodo.clase12;

public class Ingles extends IdiomaBase implements IIDioma {

	public Ingles() {
		super("Ingles");

	}

	@Override
	public void decir(String palabra) {

		String valor = getMapDePalabras().get(palabra);
		if (valor != null) {
			System.out.println(getNombre() + " = " + palabra + ": " + valor);
		} else {
			System.out.println("palabra no encontrada");
		}
	}

	@Override
	public void crearMapDePalabras() {

		getMapDePalabras().put("hola", "hello");
		getMapDePalabras().put("chau", "goodbye");
		getMapDePalabras().put("gracias", "thanks you");

	}

}
