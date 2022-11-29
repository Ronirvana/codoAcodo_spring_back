package ar.com.codoAcodo.clase12;

public class IdiomasMain {

	public static void main(String[] args) throws IdiomaDuplicadoException {

		// creando los idiomas disponibles
		IIDioma chino = new Chino();
		IIDioma espanol = new Español();
		IIDioma ingles = new Ingles();

		Persona persona = new Persona("juan", ingles);

		// ahora le decimos que diga "loro"
		persona.decir("hola");

		persona.aprender(espanol);
		persona.aprender(chino);

		persona.decir("hola");

	}

}
