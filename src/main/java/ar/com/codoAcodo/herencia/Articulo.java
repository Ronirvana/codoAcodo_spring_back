package ar.com.codoAcodo.herencia;

public class Articulo {

	private String img;
	private String titulo;
	private String autor;
	private float precio;

	public Articulo() {}

	//alt+shift+s (crea constructor con los campos)
	public Articulo(String img, String titulo, String autor, float precio) {

		this.img = img;
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {

		if(img !=null) {
			this.img = img;
		}else {
			this.img = "Marca de agua";
		}
	}

	public String getTitulo() {
		/*if(this.titulo !=null) {
			this.titulo = this.titulo.toUpperCase();
		}
		return this.titulo;*/
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

	public float getPrecio() {
		return this.precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}










}
