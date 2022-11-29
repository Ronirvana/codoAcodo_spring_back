package ar.com.codoAcodo.herencia.clase10;

public class GeneradorNumeros implements IGenerador<Long> {

	@Override
	public Long generar() {

		return 100l;
	}

}
