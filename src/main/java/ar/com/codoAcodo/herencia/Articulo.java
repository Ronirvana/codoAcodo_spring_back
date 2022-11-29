package ar.com.codoAcodo.herencia;

import java.util.Date;

public class Articulo implements Comparable<Articulo> {

	protected String img;
	private String titulo;
	private String autor;
	private float precio;
	private Date fechaPublicacion; // usar para ordenar
	private int cantidadVendido; // usar para ordenar

	public Articulo() {
	}

	// alt+shift+s (crea constructor con los campos)
	public Articulo(String img, String titulo, String autor, float precio) {

		this.img = img;
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
	}

	public String getImg() {
		return img;
	}

	public Date getFechaPublicacion() {
		return fechaPublicacion;
	}

	public void setFechaPublicacion(Date fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}

	public int getCantidadVendido() {
		return cantidadVendido;
	}

	public void setCantidadVendido(int cantidadVendido) {
		this.cantidadVendido = cantidadVendido;
	}

	public void setImg(String img) {

		if (img != null) {
			this.img = img;
		} else {
			this.img = "Marca de agua";
		}
	}

	public String getTitulo() {
		/*
		 * if(this.titulo !=null) { this.titulo = this.titulo.toUpperCase(); } return
		 * this.titulo;
		 */
		return titulo != null ? titulo.toUpperCase() : titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return this.autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Float getPrecio() {
		return this.precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Articulo [img=" + img + ", titulo=" + titulo + ", autor=" + autor + ", precio=" + precio + "]";
	}

	@Override
	public int compareTo(Articulo o) {

		// comparar por menor precio
		int cmp = this.getPrecio().compareTo(o.getPrecio());

		if (cmp == 0) {

			cmp = o.getCantidadVendido() - this.cantidadVendido;
		}

		return cmp;
	}

}
