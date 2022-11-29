package ar.com.codoAcodo.herencia.clase7;

public class Wii extends Consola implements IJugable {

	private int cantidadMandos;

	public Wii(String nombre, String marca) {
		super(nombre, marca);
		this.setCantidadMandos(2);
	}

	@Override
	public void jugar() {
		System.out.println(getNombre() + " " + getMarca() + " - jugando...");

	}

	public int getCantidadMandos() {
		return cantidadMandos;
	}

	public void setCantidadMandos(int cantidadMandos) {
		this.cantidadMandos = cantidadMandos;
	}

}
