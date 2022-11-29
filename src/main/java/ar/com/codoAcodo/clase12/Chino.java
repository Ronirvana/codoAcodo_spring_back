package ar.com.codoAcodo.clase12;

public class Chino extends IdiomaBase implements IIDioma {

	public Chino() {
		super("Chino");

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

		getMapDePalabras().put("hola", "nihao");
		getMapDePalabras().put("chau", "zaijian");
		getMapDePalabras().put("gracias", "xiexie");

	}

}
