package ar.com.codoAcodo;

public class Main2 {

	public static void main(String[] args) {
		
		Auto miPrimerAuto = new Auto(5);//f3 f5
		//Auto miSegundoAuto = new Auto();
		
		miPrimerAuto.encender();
		//miPrimerAuto.encender();
		
		//miSegundoAuto.encender();
		
		
		miPrimerAuto.acelerar();
		miPrimerAuto.acelerar();
		miPrimerAuto.acelerar();
		miPrimerAuto.acelerar();
		miPrimerAuto.acelerar();
		
		
		
		miPrimerAuto.acelerar();
		System.out.println("ahora frenando...");
		
		miPrimerAuto.frenar();
		miPrimerAuto.frenar();
		miPrimerAuto.frenar();
		miPrimerAuto.frenar();
		miPrimerAuto.frenar();
		
		miPrimerAuto.frenar();
		
		miPrimerAuto.quintaAfondo();
		
		miPrimerAuto.detener();
		
		miPrimerAuto.quintaAfondo();
		miPrimerAuto.apagar();
		
		System.out.println("fin");

	}

}
