package ar.com.codoAcodo.clase12;

public class Español extends IdiomaBase implements IIDioma {

	public Español() {
		super("Español");

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
		getMapDePalabras().put("hola", "hola");
		getMapDePalabras().put("chau", "chau");
		getMapDePalabras().put("gracias", "gracias");

	}

}
