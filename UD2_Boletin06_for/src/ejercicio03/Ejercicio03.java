package ejercicio03;

import java.util.Scanner;

public class Ejercicio03 {
	
	/* 
	 *Pedir diez números por teclado y mostrar la media.
	 */

	public static void main(String[] args) {
		
		final Integer NUM_LECTURAS = 10;
		
		// Abrimos Scanner
		
		Scanner sc = new Scanner(System.in);
		
		
		// Operamos la suma de los numeros 		
		
		Double suma = 0.0;
		
		for (Integer i = 1; i <= NUM_LECTURAS; i++) {
			
			System.out.println("Introduce el numero " + i + ":");
			suma += sc.nextDouble();
		}
		
		// Operamos la media
		
		Double media = suma / NUM_LECTURAS;
		
		System.out.println("La media es: " + media);
		
		sc.close();

	}

}

