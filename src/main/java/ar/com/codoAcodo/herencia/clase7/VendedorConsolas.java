package ar.com.codoAcodo.herencia.clase7;

public class VendedorConsolas {

	public IJugable vender() {
		return new Tablet();
	}

	public IJugable[] venderVarios() {

		Play play = new Play("play3", "sony");
		Xbox xbox = new Xbox("xbox360", "microsoft");
		Wii wii = new Wii("nintendo wii", "nintendo");
		Tablet tablet = new Tablet();

		IJugable[] jugables = new IJugable[4];
		jugables[0] = play;
		jugables[1] = xbox;
		jugables[2] = wii;
		jugables[3] = tablet;

		return jugables;

	}

}
