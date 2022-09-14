package ar.com.codoAcodo.herencia;

public class MainBuscador {

	public static void main(String[] args) {

		//simular que el usuario escribio algo

		String claveDelUsuario ="iron man";

		Buscador miBuscador = new Buscador(claveDelUsuario);


		miBuscador.buscar();

		miBuscador.mostrarResultados();
	}

}
