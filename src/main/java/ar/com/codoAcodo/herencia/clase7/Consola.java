package ar.com.codoAcodo.herencia.clase7;

public class Consola {

	private String nombre;
	private String marca;

	// private boolean encendida;

	public Consola(String nombre, String marca) {
		super();
		this.nombre = nombre;
		this.marca = marca;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

}
