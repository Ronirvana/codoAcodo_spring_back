package ar.com.codoAcodo.herencia;

public class Buscador {

	private String claveBusqueda;
	private Articulo[] resultados; // esto es nulo porque es un array

	//default: visibles en mismo paquete y por ser usadas por cualquier clase
	public Buscador(String claveDelUsuario) {

		this.setClaveBusqueda(claveDelUsuario);
		// prevenir error nulo
		this.setResultados(new Articulo[] {});
	}

	/* firma del metodo: */
	public void buscar() {
		/* simular que busco en una db */
		// ctrl+n para hacer una clase nueva

		DBUtil db = new DBUtil();

		this.setResultados(db.obtenerResultado(this.getClaveBusqueda()));

	}

	public void mostrarResultados() {

		// ahora que tengo los resultados en el objeto miBuscador, recorro
		System.out.println("Hemos encontrado " + this.cantidadResultados() + this.getClaveBusqueda());
		// forEach
		for (Articulo aux : this.getResultados()) {

			System.out.println("Titulo: " + aux.getTitulo());
			System.out.println("Autor: " + aux.getAutor());
			System.out.println("Img: " + aux.getImg());
			System.out.println("Precio: " + aux.getPrecio());
			System.out.println("----------------------------------------");

		}

	}

	public int cantidadResultados() {
		return this.resultados.length;
	}

	// getters and setters

	public String getClaveBusqueda() {
		return this.claveBusqueda;
	}

	public void setClaveBusqueda(String claveBusqueda) {
		this.claveBusqueda = claveBusqueda;
	}

	public Articulo[] getResultados() {
		return this.resultados;
	}

	public void setResultados(Articulo[] resultados) {
		this.resultados = resultados;
	}

}
