package ar.com.codoAcodo;

import java.util.Scanner;

public class MainCalculadora {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese un número: ");
		int a = teclado.nextInt();
		
		System.out.println("Ingrese otro número: ");
		int b = teclado.nextInt();
		
		int multiplicacion = a * b;
		System.out.println("el producto es: " + multiplicacion);
		
		System.out.println("ingrese un numero para restar al producto: ");
		int c = teclado.nextInt();
		
		int resta = multiplicacion - c;
		
		System.out.println("el resultado es: " + resta);
		
		
		
		teclado.close();
		
		
	
	}
}
