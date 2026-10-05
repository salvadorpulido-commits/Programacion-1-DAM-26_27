package ejercicio01;

import java.util.Scanner;

public class Ejercicio01 {
	
	/* Diseñar una aplicación que solicite al usuario un número 
	 * e indique si es par o impar.
	 */

	public static void main(String[] args) {
		
		// Abrimos Scanner
		
		Scanner sc = new Scanner(System.in);
		
		// Pedimos un numero al usuario
		
		System.out.println("Introduce un numero: ");
		
		// Declaramos variable y operamos para mostrar resultado por consola
		
		Integer x=sc.nextInt();
		if (x%2==0) {
		System.out.println("Es par");
			
		} else {
			
			System.out.println("Es impar");

		}
		
		sc.close();
		
	}

}
