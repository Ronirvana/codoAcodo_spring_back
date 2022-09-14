package ar.com.codoAcodo;

public class Auto {

	/*
	 * atributos
	 */
	boolean encendido;
	float velocidadActual; //alt+shift+r (cambia el nombre de la variable en todos lados)
	String marca;
	String modelo;
	int anio;
	float velocidadMaxima;

	// constructor por defecto
	Auto() {
		// acá va el código cuando nace el auto
		this.encendido = false;
		this.velocidadMaxima = 200;
		this.velocidadActual = 0;
	}

	Auto(final float velocidadMaxima) {
		// this
		this.velocidadActual = 0;
		this.velocidadMaxima = velocidadMaxima;
	}
	Auto(int anio, String marca, String modelo, float velocidadMaxima){
		this.anio = anio;
		this.marca = marca;
		this.modelo = modelo;
		this.velocidadMaxima = velocidadMaxima;

		this.velocidadActual = 0;
		this.encendido = false;
	}

	// métodos

	void encender() {

		if (!encendido) {

			System.out.println("se ha encendido");
			this.encendido = true;

		} else {

			System.out.println("el auto ya está encendido");
		}

	}

	void apagar() {
		if(encendido) {
			System.out.println("apagando");
			this.encendido = false;

			this.detener();
		}else {
			System.out.println("ya está apagado");
		}

	}

	void acelerar() {
		if (this.encendido) {
			if (this.velocidadActual < velocidadMaxima) {

				System.out.println("acelerando");
				this.velocidadActual++;

			}else {
				System.out.println("se te quema el auto");
			}
		} else {
			System.out.println("debe encender el auto");
		}

	}

	void frenar() {

			if(this.velocidadActual > 0) {
				System.out.println("frenando");
				this.velocidadActual--;
			}else {
				System.out.println("llegaste a 0");
			}


	}

	void quintaAfondo() {
		if(this.encendido) {
			while(this.velocidadActual < velocidadMaxima) {
				System.out.println("acelerando");
				this.velocidadActual++;
			}
			System.out.println("se quema el auto");
		}else {
			System.out.println("debe encender el auto");
		}

	}

	void detener() {

			while(this.velocidadActual > 0) {
				this.frenar();
			}

		}



	void mostrarInfo() {

		System.out.println("encendido: " + this.encendido);
	}

}
