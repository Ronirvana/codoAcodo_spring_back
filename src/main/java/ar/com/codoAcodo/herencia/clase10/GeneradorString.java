package ar.com.codoAcodo.herencia.clase10;

public class GeneradorString implements IGenerador<String> {

	@Override
	public String generar() {

		return "Soy un String";
	}

}
