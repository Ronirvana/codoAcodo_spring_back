package ar.com.codoAcodo.exception;

public class MedioDePago {

	private String nombre;

	public MedioDePago(String nombre) {

		this.setNombre(nombre);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
