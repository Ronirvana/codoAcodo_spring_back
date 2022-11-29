package ar.com.codoAcodo;

public class Main {

	public static void main(String[] args) {

		System.out.println("hola mundo");

		// voy a crear una instancia de la clase Auto

		Auto miPrimerAuto = new Auto(); // nace mi auto
		// acá ya puedo usar los métodos de Auto

		// Auto miSegundoAuto; acá no nació, definí un objeto
		// miSegundoAuto = new Auto(); // nace el objeto

		miPrimerAuto.mostrarInfo();

		// ejecutar el método encender()

		miPrimerAuto.encender();

		// cambia el estado del atributo de un objeto

		miPrimerAuto.mostrarInfo();
		
		

	}

}
