package ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {
	
	/* Pide al usuario una cantidad de dinero con decimales. 
	 * Mediante un cast a int obtén la cantidad de euros enteros. 
	 * A partir de la parte decimal, calcula también los céntimos y redondéalos correctamente.
	 */

	public static void main(String[] args) {
		
		// Abrimos Scanner
		
		Scanner sc = new Scanner(System.in);
		
		// Pedimos al usuario una cantidad con decimales
		
		System.out.println("Introduce una cantidad de dinero con decimales: ");
		Double dinero = sc.nextDouble();
		
		// Hacemos conversion a numero entero mediante cast 
		
		Integer euros = (int) (double) dinero;
		
		// Operamos con Math.round para restar los euros y quedarnos con la parte decimal
		// hacemos cast parta pasrlo a entero
		
		Integer centimos = (int) Math.round ((dinero - euros) * 100 );
		
		System.out.println("La cantidad introducida son: " + euros + " euros " + "con " + centimos + " centimos. ");
		
		// Cerramos Scanner
		
		sc.close();
		

	}

}
