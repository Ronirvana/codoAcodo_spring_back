package ar.com.codoAcodo.herencia.clase10;

public class MainGenerador {

	public static void main(String[] args) {

		GeneradorString s = new GeneradorString();
		String v = s.generar();
		System.out.println(v);

		GeneradorNumeros n = new GeneradorNumeros();
		Long l = n.generar();
		System.out.println("soy el número: " + l);

	}

}
