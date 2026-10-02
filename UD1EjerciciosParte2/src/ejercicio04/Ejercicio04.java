package ejercicio04;

import java.util.Scanner;

public class Ejercicio04 {
	
	/* Pide al usuario un número real y muestra: 
	 * el entero inmediatamente inferior mediante Math.floor(), 
	 * el entero inmediatamente superior mediante Math.ceil() 
	 * y el entero más cercano mediante Math.round().
	 */

	public static void main(String[] args) {

		// Abrimos Scanner
		
		Scanner sc = new Scanner(System.in);
		
		// Pedimos un numero real al usuario
		
		System.out.println("Introduce un numero real: ");
		Double numero = sc.nextDouble();
		
		// Operamos
		
		Double inferior = Math.floor(numero);
		Double superior = Math.ceil(numero);
		Long cercano = Math.round(numero);
		
		
		// Devolvemos resultados
		
		System.out.println("El numero inferior es: " + inferior);
		System.out.println("El numero superior es: " + superior);
		System.out.println("El numero mas cercano es: " + cercano);
		
		// Cerramos Scanner
		
		sc.close();
	}

}
