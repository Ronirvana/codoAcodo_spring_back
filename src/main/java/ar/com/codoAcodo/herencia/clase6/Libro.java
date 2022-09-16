package ar.com.codoAcodo.herencia.clase6;

import ar.com.codoAcodo.herencia.Articulo;

public class Libro extends Articulo{
	
	//atributos propios del libro
	
	private int nroPaginas;
	private String isbn;
	
	public Libro(String img, String titulo, String autor, float precio) {
		//la primer linea de código del constructor debe ser "invocar constructor del padre"
		
		super(img,titulo,autor,precio);
	}
	
	//polimorfismo
	public Libro(String img, String titulo, String autor, float precio, int nroPaginas, String isbn) {
		
		super(img,titulo,autor,precio);
		//seteo lo que es propio del hijo
		this.setNroPaginas(nroPaginas);
		this.setIsbn(isbn);
	}

	public int getNroPaginas() {
		return nroPaginas;
	}

	public void setNroPaginas(int nroPaginas) {
		this.nroPaginas = nroPaginas;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return super.toString() +", Libro [nroPaginas=" + nroPaginas + ", isbn=" + isbn + "]";
	}
	
	
	
	
	
	
	

}
