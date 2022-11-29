package ar.com.codoAcodo.herencia.clase7;

public class Play extends Consola implements IJugable {

	private boolean chipeada;

	public Play(String nombre, String marca) {
		super(nombre, marca);

	}

	public boolean isChipeada() {
		return chipeada;
	}

	public void Chipear() {
		if (!isChipeada()) {
			setChipeada(true);
		}
	}

	public void setChipeada(boolean chipeada) {
		this.chipeada = chipeada;
	}

	@Override
	public void jugar() {
		System.out.println(getNombre() + " " + getMarca() + " -  jugando...");

	}

	// por implementar IJugable está obligada a escribir el método jugar()

}
