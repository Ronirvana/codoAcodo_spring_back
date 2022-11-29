package ar.com.codoAcodo.herencia.clase7;

public class Xbox extends Consola implements IJugable {

	public Xbox(String nombre, String marca) {
		super(nombre, marca);

	}

	@Override
	public void jugar() {
		System.out.println(getNombre() + " " + getMarca() + " -  jugando...");

	}
}
